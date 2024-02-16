package forme;

public class Cercle {
    private int rayon;
    private Point centre;

    public Cercle(int rayon) {
        setRayon(rayon);
    }

    public Cercle(int rayon, Point centre) {
        setRayon(rayon);
        setCentre(centre);
    }

    public int getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double getAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public void deplaceCentre(int dX, int dY) {
        centre.deplaceXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Cercle : \n rayon = " + rayon + "\n" +
                "centre = " + centre + "\n" +
                "perimetre = " + getPerimetre() + "\n" +
                "aire = " + getAire();
    }
}
