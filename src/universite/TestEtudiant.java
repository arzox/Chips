package universite;

public class TestEtudiant {
    public static void main(String[] args) {

        //Creation du groupe A
        Groupe groupeA = new Groupe("A");

        // Création des étudiants
        // IMPORTANT mettre des valeurs qui ne respectent pas les contraintes
        // pour vérifier leur prise en compte
        Etudiant etudiant1 = new Etudiant("DUPONTP", "DUPONT", "pierre");
        etudiant1.setGroupe(groupeA);
        Etudiant etudiant2 = new Etudiant("martinf", "martin", "francis");
        // Ajouter une adresse
        etudiant2.setAdresse("2 Place Doyen Gosse");

        etudiant2.addNote(8.5);
        etudiant2.addNote(10.0);
        etudiant2.addNote(11.5);


        System.out.println(etudiant1);
        System.out.println(etudiant2);


    }
}
