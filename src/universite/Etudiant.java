package universite;

import java.util.Arrays;

public class Etudiant {

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
    private int nbNotes = 0;
    private Groupe groupe;

    private double[] notes = new double[5];


    public Etudiant(String login, String nom, String prenom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
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

    public String getMail() {
        return this.prenom.toLowerCase() + "." + this.nom.toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    public double[] getNotes() {
        return notes;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void addNote(double note){
        if(nbNotes < notes.length){
            notes[nbNotes] = note;
            nbNotes ++;
        }else{
            System.out.println("Il n'y a plus de places");
        }
    }

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

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public double getMoyenne() {
        double moyenne = 0;
        for (double note : notes) {
            moyenne += note;
        }
        return moyenne / nbNotes;
    }

    public boolean existAdresse() {
        return !adresse.isEmpty();
    }

    public boolean existGroupe() {
        return groupe != null;
    }

    @Override
    public String toString() {
        return "------------" + '\n' +
                "Login : " + getLogin() + '\n' +
                "Nom Complet: " + getNomComplet() + '\n' +
                "Groupe : " + getGroupe().getLibelle() + '\n' +
                "Adresse : " + getAdresse() + '\n' +
                "Mail : " + getMail() + '\n' +
                "Moyenne : " + getMoyenne() + '\n' +
                nbNotes + " notes : " + Arrays.toString(notes) + '\n' +
                "------------";
    }
}
