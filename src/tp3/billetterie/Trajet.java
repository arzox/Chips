package tp3.billetterie;

public class Trajet {

    private String depart;
    private String arrivee;
    private int distance;

    private final static int DISTANCE_MAX = 2000;
    private final static int DISTANCE_MIN = 5;

    public Trajet(String depart, String arrivee, int distance) {
        setDepart(depart);
        setArrivee(arrivee);
        setDistance(distance);
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        if (depart == null || depart.isEmpty()) {
            throw new IllegalArgumentException("Le départ ne peut pas être vide.");
        }
        this.depart = depart.toUpperCase();
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        if (arrivee == null || arrivee.isEmpty()) {
            throw new IllegalArgumentException("L'arrivée ne peut pas être vide.");
        }
        this.arrivee = arrivee;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {

        this.distance = Math.max(DISTANCE_MIN, Math.min(DISTANCE_MAX, distance));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + getDepart() + " -> " + getArrivee() + " ( " + getDistance() + " km)";
    }

}
