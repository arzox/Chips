package jeu;

import java.util.ArrayList;

public class Plato {
    ArrayList<Carreau> carreaux;
    Chateau chateauBleu = new Chateau(true);
    Chateau chateauRouge = new Chateau(false);

    final String resetColor = "\033[0m";
    Plato(int taille) {
        carreaux = new ArrayList<>(taille);
        for (int i = 0; i < taille; i++) {
            carreaux.add(new Carreau());
        }
    }
    public void initTour() {
        System.out.println(chateauBleu.color + "---Chateau bleu : " + chateauBleu.getRessources() + "---" + "\033[0m");
        chateauBleu.ajouterGuerrier();
        System.out.println(chateauRouge.color + "---Chateau rouge : " + chateauBleu.getRessources() + "---" + "\033[0m");
        chateauRouge.ajouterGuerrier();
        chateauBleu.incrementerRessources();
        chateauRouge.incrementerRessources();
    }

    public void deplaceGuerriers() {
        ArrayList<Guerrier> bleuWaitingList = chateauBleu.entrainer();
        for (int i = 0; i < carreaux.size(); i++) {
            Carreau carreau = carreaux.get(i);
            assert carreau.estChampDeBataille();
            if (carreau.estBleu() || !bleuWaitingList.isEmpty()) {
                boolean doMoveElfe = i < carreaux.size() - 2 && carreaux.get(i + 2).estRouge() && !carreaux.get(i + 1).estBleu();
                ArrayList<Guerrier> temp = doMoveElfe ? carreau.retirerGuerrierBleuNain() : carreau.retirerGuerrierBleu();
                carreau.ajouterGuerriers(bleuWaitingList);
                bleuWaitingList = temp;
            } else if (carreau.estRouge()) {
                boolean doMoveElfe = i > 0 && carreaux.get(i - 1).estBleu();
                ArrayList<Guerrier> guerriersRougesToMove = doMoveElfe ? carreau.retirerGuerrierRougeNain() : carreau.retirerGuerrierRouge();
                carreaux.get(i - 1).setGuerriersRouges(guerriersRougesToMove);
            }
            if (i == carreaux.size() - 1) {
                carreau.ajouterGuerriers(chateauRouge.entrainer());
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

    public void subitFleches() {
        for (int i = 0; i < carreaux.size(); i++) {
            Carreau carreau = carreaux.get(i);
            if (carreau.estBleu() && i < carreaux.size() - 1) {
                carreaux.get(i + 1).subitFlechesRouge(carreau.getElfeBleu() * Elfe.FORCE * 3);
            } else if (carreau.estRouge() && i > 0) {
                carreaux.get(i - 1).subitFlechesBleu(carreau.getElfeRouge() * Elfe.FORCE * 3);
            }
        }
    }

    public void afficheCarreaux() {
        int maxTailleRouge = 0;
        int maxTailleBleu = 0;
        ArrayList<String> bleu = new ArrayList<>();
        ArrayList<String> rouge = new ArrayList<>();
        System.out.println("Affichage des carreaux");
        for (Carreau carreau : carreaux) {
            bleu.add((chateauBleu.color + carreau.getGuerriersBleus()));
            rouge.add((chateauRouge.color + carreau.getGuerriersRouges()));
            maxTailleRouge = Math.max(maxTailleRouge, rouge.get(rouge.size() - 1).length());
            maxTailleBleu = Math.max(maxTailleBleu, bleu.get(bleu.size() - 1).length());
        }
        for (int i = 0; i < carreaux.size(); i++) {
            int bleuSizeDifferenceMax = maxTailleBleu - bleu.get(i).length();
            int rougeSizeDifferenceMax = maxTailleRouge - rouge.get(i).length();
            System.out.println(bleu.get(i) + resetColor + (" ").repeat(bleuSizeDifferenceMax) + " | " +
                    (" ").repeat(rougeSizeDifferenceMax) + rouge.get(i) + resetColor);
        }
    }

    public Chateau getWinner() {
        boolean isRedOnFirstCarreau = carreaux.get(0).estRouge() && !carreaux.get(0).estBleu();
        boolean isBlueOnLastCarreau = carreaux.get(carreaux.size() - 1).estBleu() && !carreaux.get(carreaux.size() - 1).estRouge();
        if (isRedOnFirstCarreau) {
            return carreaux.get(0).getGuerriersRouges().get(0).getChateau();
        } else if (isBlueOnLastCarreau) {
            return carreaux.get(carreaux.size() - 1).getGuerriersBleus().get(0).getChateau();
        }
        return null;
    }

}
