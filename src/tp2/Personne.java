package tp2;

import universite.EtudiantUtilitaire;

public abstract class Personne {
    /**
     * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
     * et adresse).
     * ATTENTION des contraintes sur la notion d’étudiant :
     * – un étudiant doit toujours avoir un login en minuscule
     * – un étudiant doit toujours avoir un nom et un prénom avec
     * le premier caractère en majuscule et les autres en minuscule.
     */

    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    private double[] notes = new double[5];


    public Personne(String login, String nom, String prenom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
    }

    public Personne(String login, String nom, String prenom, String adresse) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
    }

    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }

    public String getAdresse() {
        return adresse;
    }

    public abstract String getMail();

    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }

    public void setPrenom(String prenom) {
        this.prenom = EtudiantUtilitaire.capitalize(prenom);
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean existAdresse() {
        return !adresse.isEmpty();
    }

    @Override
    public String toString() {
        return  "\n" +
                "Personne : \n" +
                "Login : " + getLogin() + '\n' +
                "Nom Complet: " + getNomComplet() + '\n' +
                "Adresse : " + getAdresse() + '\n' +
                "Mail : " + getMail() + '\n';
    }
}
