package forme;

public class Rectangle {
    private int largeur;
    private int longueur;
    private Point origine;

    public Rectangle(int largeur, int longueur) {
        setLargeur(largeur);
        setLongueur(longueur);
        this.origine = new Point(0,0);
    }

    public Rectangle(int largeur, int longueur, int valX, int valY) {
        setLargeur(largeur);
        setLongueur(longueur);
        this.origine = new Point(valX, valY);
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public Point getOrigine() {
        try {
            return origine.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public double getPerimetre() {
        return 2 * getLargeur() + 2 * getLongueur();
    }

    public double getAire() {
        return getLargeur() * getLongueur();
    }

    public void deplaceOrigine(int dX, int dY) {
        origine.deplaceXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Rectangle : \n largeur = " + getLargeur() + "\n" +
                "longueur = " + getLongueur() + "\n" +
                "origine = " + getOrigine() + "\n" +
                "perimetre = " + getPerimetre() + "\n" +
                "aire = " + getAire();
    }
}
