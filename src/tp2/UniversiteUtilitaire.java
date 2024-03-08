package tp2;

public class UniversiteUtilitaire {
    public static void afficheEtudiant(Etudiant e) {
        String addresse = e.getAdresseParent() != null ? "Adresse : " + e.getAdresse() + " (" + e.getAdresseParent() + ")" : "Adresse : " + e.getAdresse();
        System.out.println("Nom : " + e.getNom());
        System.out.println("Prénom : " + e.getPrenom());
        System.out.println("Adresse : " + addresse);
        System.out.println("Mail : " + e.getMail());
    }

    public static void affichePersonnel(Personnel p) {
        System.out.println("Nom : " + p.getNom());
        System.out.println("Prénom : " + p.getPrenom());
        System.out.println("Mail : " + p.getMail());
        System.out.println("Salaire : " + p.getSalaire());
        System.out.println("Echelon : " + p.getEchelon());
        System.out.println("Point Indice : " + p.getPointIndice());
    }
}
