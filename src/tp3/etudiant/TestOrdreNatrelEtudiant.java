package tp3.etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class TestOrdreNatrelEtudiant {

    public static void main(String[] args) {

        // Créer les étudiants

        Etudiant e1 = new Etudiant("feugierq", "Quentin", "Feugier");
        Etudiant e2 = new Etudiant("ratgrism", "Morgan", "Ratgris");
        Etudiant e3 = new Etudiant("boussardl", "Léa", "Boussard");
        Etudiant e4 = new Etudiant("ratgrisj", "Jules", "Ratgris");

        // Créer la liste d'étudiants quelconque et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();

        mesEtudiantsOrdreQcq.add(e1);
        mesEtudiantsOrdreQcq.add(e2);
        mesEtudiantsOrdreQcq.add(e3);
        mesEtudiantsOrdreQcq.add(e4);

        // Afficher la liste d'étudiants quelconque

        System.out.println("Liste d'étudiants quelconque :");
        affichageEtudiants(mesEtudiantsOrdreQcq);
        System.out.println("");


        // Créer l'ensemble d'étudiants trié et ajouter les étudiants
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();

        mesEtudiantsTries.add(e1);
        mesEtudiantsTries.add(e2);
        mesEtudiantsTries.add(e3);
        mesEtudiantsTries.add(e4);

        // Afficher l'ensemble d'étudiants trié
        System.out.println("Liste d'étudiants triée :");
        affichageEtudiants(mesEtudiantsTries);

    }
    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }

}
