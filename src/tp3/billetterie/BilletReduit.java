package tp3.billetterie;

import static tp3.billetterie.BilletUtilitaire.arrondir;

public class BilletReduit extends Billet{

    private double tauxDeReduction;

    private final static double TAUX_MIN = 0.05;
    private final static double TAUX_MAX = 0.5;

    public BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }

    public double getTauxReduction() {
        return tauxDeReduction*100;
    }

    public void setTauxDeReduction(double tauxDeReduction) {
        this.tauxDeReduction = Math.max(TAUX_MIN, Math.min(TAUX_MAX, tauxDeReduction));
    }

    public double getPrix() {
        return arrondir(super.getPrix() * (1 - tauxDeReduction));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + getDepart() + " -> " + getArrivee() + " ( " + getDistance() + " km) : " +
                getPrix() + " €" + " avec une réduction de " + getTauxReduction() + "%";
    }

}
