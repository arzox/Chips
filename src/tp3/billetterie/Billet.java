package tp3.billetterie;

import static tp3.billetterie.BilletUtilitaire.arrondir;

public class Billet {

    private double prixAuKm;

    private final static double PRIX_MIN = 0.1;
    private final static double PRIX_MAX = 2;

    private Trajet trajet;

    public Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        setPrixAuKm(prixAuKm);
    }

    public double getPrixAuKm() {
        return prixAuKm;
    }

    public void setPrixAuKm(double prixAuKm) {
        this.prixAuKm = Math.max(PRIX_MIN, Math.min(PRIX_MAX, prixAuKm));
    }

    public double getPrix() {
        return arrondir(getDistance() * prixAuKm);
    }

    public String getDepart() {
        return trajet.getDepart();
    }

    public String getArrivee() {
        return trajet.getArrivee();
    }

    public int getDistance() {
        return trajet.getDistance();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + getDepart() + " -> " + getArrivee() + " ( " +
                getDistance() + " km) : " + getPrix() + " €";
    }

}
