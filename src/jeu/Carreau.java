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
    public void ajouterGuerrier(Guerrier guerrier) {
        if (guerrier.estBleu()) {
            getGuerriersBleus().add(guerrier);
        } else {
            getGuerriersRouges().add(guerrier);
        }
    }
    public void ajouterGuerriers(ArrayList<Guerrier> guerriers) {
        for (Guerrier guerrier : guerriers) {
            ajouterGuerrier(guerrier);
        }
    }
    public ArrayList<Guerrier> retirerGuerrierBleuNain() {
        ArrayList<Guerrier> guerriersNainsBleus = new ArrayList<>();
        for (int i = getGuerriersBleus().size() - 1; i >= 0; i--) {
            Guerrier guerrier = getGuerriersBleus().get(i);
            if (guerrier instanceof Fabio) {
                guerriersNainsBleus.add(getGuerriersBleus().remove(i));
            }
        }
        return guerriersNainsBleus;
    }
    public ArrayList<Guerrier> retirerGuerrierRougeNain() {
        ArrayList<Guerrier> guerriersNainsRouges = new ArrayList<>();
        for (int i = getGuerriersRouges().size() - 1; i >= 0; i--) {
            Guerrier guerrier = getGuerriersRouges().get(i);
            if (guerrier instanceof Fabio) {
                guerriersNainsRouges.add(getGuerriersRouges().remove(i));
            }
        }
        return guerriersNainsRouges;
    }
    public ArrayList<Guerrier> retirerGuerrierBleu() {
        ArrayList<Guerrier> guerriersBleus = getGuerriersBleus();
        setGuerriersBleus(new ArrayList<>());
        return guerriersBleus;
    }
    public ArrayList<Guerrier> retirerGuerrierRouge() {
        ArrayList<Guerrier> guerriersRouges = getGuerriersRouges();
        setGuerriersRouges(new ArrayList<>());
        return guerriersRouges;
    }
    public void supprimerGuerrier(Guerrier guerrier) {
        if (guerrier.estBleu()) {
            getGuerriersBleus().remove(guerrier);
        } else {
            getGuerriersRouges().remove(guerrier);
        }
    }

    public void subitFlechesRouge(int degats) {
        for (Guerrier guerrier : getGuerriersRouges()) {
            guerrier.subitDegats(degats / getGuerriersRouges().size());
        }
    }
    public void subitFlechesBleu(int degats) {
        for (Guerrier guerrier : getGuerriersBleus()) {
            guerrier.subitDegats(degats / getGuerriersBleus().size());
        }
    }
    public int getElfeBleu() {
        int elfe = 0;
        for (Guerrier guerrier : getGuerriersBleus()) {
            if (guerrier instanceof Elfe) {
                elfe++;
            }
        }
        return elfe;
    }
    public int getElfeRouge() {
        int elfe = 0;
        for (Guerrier guerrier : getGuerriersRouges()) {
            if (guerrier instanceof Elfe) {
                elfe++;
            }
        }
        return elfe;
    }
    public boolean estRouge() {
        return getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty();
    }

    public boolean estBleu() {
        return getGuerriersRouges().isEmpty() && !getGuerriersBleus().isEmpty();
    }

    public boolean estChampDeBataille() {
        return !getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty();
    }

    public void lanceCombat() {
        if (estChampDeBataille()) {
            while (!getGuerriersBleus().isEmpty() && !getGuerriersRouges().isEmpty()) {
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
}
