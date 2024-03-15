package jeu;

import java.util.ArrayList;

public class Carreau {
    ArrayList<Guerrier> guerriersBleus = new ArrayList<>();
    ArrayList<Guerrier> guerriersRouges = new ArrayList<>();
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

    public boolean estBleu() {
        return getGuerriersRouges().isEmpty();
    }

    public boolean estChampDeBataille() {
        return !getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty();
    }

    public void lanceCombat() {
        while(!getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty()) {
            // Attaque des Rouges
            for (Guerrier guerrier : getGuerriersRouges()) {
                guerrier.attaque(getGuerriersBleus().get(0));
                if (!getGuerriersBleus().get(0).estVivant()) {
                    supprimerGuerrier(getGuerriersBleus().get(0));
                    if (getGuerriersBleus().isEmpty()) {
                        break;
                    }
                }
            }

            // Attaque des Bleus
            for (Guerrier guerrier : getGuerriersBleus()) {
                guerrier.attaque(getGuerriersRouges().get(0));
                if (!getGuerriersRouges().get(0).estVivant()) {
                    supprimerGuerrier(getGuerriersRouges().get(0));
                    if (getGuerriersRouges().isEmpty()) {
                        break;
                    }
                }
            }
        }
    }
}
