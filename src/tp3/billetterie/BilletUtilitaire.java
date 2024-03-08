package tp3.billetterie;

import java.util.ArrayList;

public class BilletUtilitaire {

    public static double arrondir(double prix) {
        int prix2 = (int) (prix * 100);
        return (double) prix2 / 100;
    }

    public static void afficheTrajets(ArrayList<Trajet> trajets) {
        System.out.println("Liste des trajets :");
        for (Trajet t : trajets) {
            System.out.println(t);
        }
    }

    public static void afficheBillets(ArrayList<Billet> billets) {
        System.out.println("Liste des billets :");
        for (Billet b : billets) {
            System.out.println(b);
        }
    }

}
