package jeu;

import java.util.ArrayList;

public class Plato {
    ArrayList<Carreau> carreaux;
    Plato(int taille) {
        carreaux = new ArrayList<>(taille);
        for (int i = 0; i < taille; i++) {
            carreaux.add(new Carreau());
        }
    }

    public void deplaceGuerriers() {
        for (int i = 0; i < carreaux.size(); i++) {
            Carreau carreau = carreaux.get(i);
            assert carreau.estChampDeBataille();
            if (carreau.estRouge()) {
                carreaux.get(i - 1).setGuerriersRouges(carreau.retirerGuerrierRouge());
            } else {
                carreaux.get(i + 1).setGuerriersBleus(carreau.retirerGuerrierBleu());
            }
        }
    }
}
