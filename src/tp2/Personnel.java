package tp2;

public class Personnel extends Personne{
    public static final int ECHELON_MIN = 1;
    public static final int ECHELON_MAX = 4;
    public static final double POINT_INDICE_MIN = 1000;
    public static final double POINT_INDICE_MAX = 1200;

    int echelon;
    double pointIndice;

    Personnel(String login, String nom, String prenom) {
        super(login, nom, prenom);
    }

    Personnel(String login, String nom, String prenom, int echelon, double pointIndice) {
        super(login, nom, prenom);
        setEchelon(echelon);
        setPointIndice(pointIndice);
    }

    public int getEchelon() {
        return echelon;
    }

    public double getPointIndice() {
        return pointIndice;
    }

    public double getSalaire() {
        return echelon * pointIndice;
    }

    public String getMail() {
        return getPrenom().toLowerCase() + "." + getNom().toLowerCase() + "@univ-grenoble-alpes.fr";
    }

    public void setEchelon(int echelon) {
        this.echelon = Clamp.clamp(echelon, ECHELON_MIN, ECHELON_MAX);
    }

    public void setPointIndice(double pointIndice) {
        this.pointIndice = Clamp.clamp(pointIndice, POINT_INDICE_MIN, POINT_INDICE_MAX);
    }
}
