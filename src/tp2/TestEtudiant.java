package tp2;

import universite.EtudiantUtilitaire;

import java.util.ArrayList;

public class TestEtudiant {
    public static void main(String[] args) {
        // Création d'une liste de personnes
        ArrayList<Personne> personnes = new ArrayList<>();

        // Création de trois étudiants
        Etudiant etudiant1 = new Etudiant("SANZF", "FLORIANT", "Sanz");
        Etudiant etudiant2 = new Etudiant("portepa", "Pierre-Antoine", "Porte");
        Etudiant etudiant3 = new Etudiant("burlatn", "nils", "burlat", "1 rue pas loin", "10 rue des parents");
        // Ajouter l'adresse de ses parents à l'étudiant1
        // Ajouter l'adresse personnelle de l'étudiant2
        etudiant1.setAdresse("13 rue à côté", "23 rue beaucoup plus loin");
        etudiant2.setAdresse("30 avenue Berlioz");
        // Ajouter les trois étudiants à la liste
        personnes.add(etudiant1);
        personnes.add(etudiant2);
        personnes.add(etudiant3);
        // Affichage des personnes
        // Utilisation d'une simplifacation d'écriture avec le for
        for (Personne personne : personnes) {
            UniversiteUtilitaire.afficheEtudiant((Etudiant) personne);
        }
    }
}
