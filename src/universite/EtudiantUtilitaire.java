package universite;

public class EtudiantUtilitaire {
    public static String capitalize(String chaine) {
        return chaine.toLowerCase().substring(0, 1).toUpperCase() + chaine.toLowerCase().substring(1);
    }
}
