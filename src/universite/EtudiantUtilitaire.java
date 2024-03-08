package universite;

public class EtudiantUtilitaire {
    public static String capitalize(String chaine) {
        return chaine.toLowerCase().substring(0, 1).toUpperCase() + chaine.toLowerCase().substring(1);
    }

    public static void afficheEtudiant(Etudiant e) {
        System.out.println("Nom : " + e.getNom());
        System.out.println("Prénom : " + e.getPrenom());
        System.out.println("Adresse : " + e.getAdresse());
        System.out.println("Mail : " + e.getMail());
        System.out.println("Groupe : " + e.getGroupe().getLibelle());
        System.out.println("Moyenne : " + e.getMoyenne());
    }
}
