package jeu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chateau {
    int RESSOURCES_INITIAL = 3;
    int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    int ressources;
    boolean estBleu;
    LinkedList<Guerrier> guerriers;
    Chateau(boolean estBleu) {
        this.estBleu = estBleu;
        ressources = RESSOURCES_INITIAL;
    }
    public boolean estBleu() {
        return estBleu;
    }
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        guerriers.add(guerrier);
    }
    public LinkedList<Guerrier> getGuerriersNovices() {
        return guerriers;
    }

    public ArrayList<Guerrier> entrainer() {
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();
        while(guerriers.getFirst().getRessourcePourEntrainement() <= ressources) {
            ressources -= guerriers.getFirst().getRessourcePourEntrainement();
            guerriersEntraines.add(guerriers.poll());
        }
        return guerriersEntraines;
    }

    void incrementerRessources() {
        ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }
}
