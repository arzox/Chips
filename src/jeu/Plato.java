package jeu;

import java.util.ArrayList;

public class Plato {
    ArrayList<Carreau> carreaux;
    Chateau chateauBleu = new Chateau(true);
    Chateau chateauRouge = new Chateau(false);
    Plato(int taille) {
        carreaux = new ArrayList<>(taille);
        for (int i = 0; i < taille; i++) {
            carreaux.add(new Carreau());
        }
    }

    public void deplaceGuerriers() {
        ArrayList<Guerrier> bleuWaitingList = chateauBleu.entrainer();
        for (int i = 0; i < carreaux.size(); i++) {
            Carreau carreau = carreaux.get(i);
            assert carreau.estChampDeBataille();
            if (carreau.estBleu() || !bleuWaitingList.isEmpty()) {
                ArrayList<Guerrier> temp = carreau.retirerGuerrierBleu();
                carreau.setGuerriersBleus(bleuWaitingList);
                bleuWaitingList = temp;
            } else if (carreau.estRouge()) {
                carreaux.get(i - 1).setGuerriersRouges(carreau.retirerGuerrierRouge());
            }
            if (i == carreaux.size() - 1) {
                carreau.setGuerriersRouges(chateauRouge.entrainer());
            }
        }
    }

    public void lanceCombats() {
        for (Carreau carreau : carreaux) {
            if (carreau.estChampDeBataille()) {
                carreau.lanceCombat();
            }
        }
    }

    public void afficheCarreaux() {
        System.out.println("Affichage des carreaux");
        for (Carreau carreau : carreaux) {
            System.out.println("Bleus: " + carreau.getGuerriersBleus() + " | " + carreau.getGuerriersRouges());
        }
    }

    public Chateau getWinner() {
        if (carreaux.get(0).estRouge() && !carreaux.get(0).estBleu()) {
            return carreaux.get(0).getGuerriersRouges().get(0).getChateau();
        } else if (carreaux.get(carreaux.size() - 1).estBleu() && !carreaux.get(carreaux.size() - 1).estRouge()) {
            return carreaux.get(carreaux.size() - 1).getGuerriersBleus().get(0).getChateau();
        }
        return null;
    }

    public void initTour() {
        System.out.println(chateauBleu.color + "---Chateau bleu :" + chateauBleu.getRessources() + "---" + "\033[0m");
        chateauBleu.ajouterGuerrier();
        System.out.println(chateauRouge.color + "---Chateau rouge" + chateauBleu.getRessources() + "---" + "\033[0m");
        chateauRouge.ajouterGuerrier();
        chateauBleu.incrementerRessources();
        chateauRouge.incrementerRessources();
    }
}
