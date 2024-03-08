package tp2;

public class Etudiant extends Personne {

    /**
     * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
     * et adresse).
     * ATTENTION des contraintes sur la notion d’étudiant :
     * – un étudiant doit toujours avoir un login en minuscule
     * – un étudiant doit toujours avoir un nom et un prénom avec
     * le premier caractère en majuscule et les autres en minuscule.
     */
    private String adresseParent;

    public Etudiant(String login, String nom, String prenom) {
        super(login, nom, prenom);
    }

    public Etudiant(String login, String nom, String prenom, String adresse, String adresseParent) {
        super(login, nom, prenom, adresse);
        this.adresseParent = adresseParent;
    }

    @Override
    public String getMail() {
        return getPrenom().toLowerCase() + "." + getNom().toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    public String getAdresseParent() {
        return adresseParent;
    }

    public void setAdresse(String adresse, String adresseParent) {
        setAdresse(adresse);
        this.adresseParent = adresseParent;
    }

    @Override
    public boolean existAdresse() {
        return !getAdresse().isEmpty() || !adresseParent.isEmpty();
    }
}