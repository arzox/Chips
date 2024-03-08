package jeu;

import java.util.ArrayList;

public class Carreau {
    ArrayList<Guerrier> guerriersBleus;
    ArrayList<Guerrier> guerriersRouges;
    Carreau() {}

    public ArrayList<Guerrier> getGuerriersBleus() {
        return guerriersBleus;
    }
    public ArrayList<Guerrier> getGuerriersRouges() {
        return guerriersRouges;
    }
    public void setGuerriersBleus(ArrayList<Guerrier> guerriersBleus) {
        this.guerriersBleus = guerriersBleus;
    }
    public void setGuerriersRouges(ArrayList<Guerrier> guerriersRouges) {
        this.guerriersRouges = guerriersRouges;
    }

    public ArrayList<Guerrier> retirerGuerrierBleu() {
        ArrayList<Guerrier> guerriersBleus = getGuerriersBleus();
        setGuerriersBleus(new ArrayList<Guerrier>());
        return guerriersBleus;
    }
    public ArrayList<Guerrier> retirerGuerrierRouge() {
        ArrayList<Guerrier> guerriersRouges = getGuerriersRouges();
        setGuerriersRouges(new ArrayList<Guerrier>());
        return guerriersRouges;
    }
    public void supprimerGuerrier(Guerrier guerrier) {
        if (guerrier.estBleu()) {
            getGuerriersBleus().remove(guerrier);
        } else {
            getGuerriersRouges().remove(guerrier);
        }
    }

    public boolean estRouge() {
        return getGuerriersBleus().isEmpty();
    }

    public boolean estChampDeBataille() {
        return !getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty();
    }

    public void lanceCombat() {
        return;
    }

}
