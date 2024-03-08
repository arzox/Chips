package tp3.etudiant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestEtudianTriMoyenne {

    public static void main(String[] args) {
        // Créer les étudiants

        Etudiant e1 = new Etudiant("feugierq", "Quentin", "Feugier");
        Etudiant e2 = new Etudiant("ratgrism", "Morgan", "Ratgris");
        Etudiant e3 = new Etudiant("boussardl", "Léa", "Boussard");
        Etudiant e4 = new Etudiant("ratgrisj", "Jules", "Ratgris");

        // Créer la liste d'étudiants et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsTries = new ArrayList<>();

        mesEtudiantsTries.add(e1);
        mesEtudiantsTries.add(e2);
        mesEtudiantsTries.add(e3);
        mesEtudiantsTries.add(e4);

        // Ajouter des notes aléatoires aux étudiants
        for (Etudiant mesEtudiantsTry : mesEtudiantsTries) {
            for (int j = 0; j < 5; j++) {
                mesEtudiantsTry.setRandomNote();
            }
        }

        // Afficher la liste des étudiants avant tri

        System.out.println("Liste d'étudiants avant tri :");
        affichageEtudiants(mesEtudiantsTries);
        System.out.println(" ");

        // trier la liste

        mesEtudiantsTries.sort(Etudiant.compareEtudiantMoyenne);
        // Afficher la liste des étudiants après tri

        System.out.println("Liste d'étudiants après tri :");
        affichageEtudiants(mesEtudiantsTries);

    }

    private static void affichageEtudiants(ArrayList<Etudiant> etudiants) {
        for (Etudiant mesEtudiants : etudiants) {
            System.out.println(mesEtudiants.getNom() + ", " + mesEtudiants.getPrenom() + " : " + mesEtudiants.getMoyenne());
        }
    }

}
