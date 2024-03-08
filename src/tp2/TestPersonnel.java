package tp2;

import java.util.ArrayList;

public class TestPersonnel {
    public static void main(String[] args) {
        // Création de deux personnels
        Personnel personnel1 = new Personnel("goulianj", "Jérôme", "Goulian");
        Personnel personnel2 = new Personnel("brunetf", "Francis", "Brunet- Manquat", 0, 1400);
        Personnel personnel3 = new Personnel("lejeuna", "Anne", "Lejeune");

        personnel3.setEchelon(5);
        personnel3.setPointIndice(900);

        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(personnel1);
        personnes.add(personnel2);
        personnes.add(personnel3);

        // Ajouter les personnels à la liste personnes
        // Créer et ajouter les personnels à une liste personnels
        ArrayList<Personnel> personnels = new ArrayList<>();
        personnels.add(personnel1);
        personnels.add(personnel2);
        personnels.add(personnel3);
        // Affichage des personnes
        // Utilisation d'une simplifacation d'écriture avec le for
        for (Personne personne : personnes) {
            UniversiteUtilitaire.affichePersonnel((Personnel) personne);
        }
        // Affichage du personnel
        for (Personnel personnel : personnels) {
            UniversiteUtilitaire.affichePersonnel(personnel);
        }
    }
}
