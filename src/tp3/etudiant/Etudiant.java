package tp3.etudiant;

import tp2.universite.Personne;
import tp2.contrainte.ContrainteUtilitaire;
import tp2.contrainte.Note;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant extends Personne implements Comparable<Etudiant> {

    /**
     * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
     * et adresse).
     * ATTENTION des contraintes sur la notion d’étudiant :
     * – un étudiant doit toujours avoir un login en minuscule
     * – un étudiant doit toujours avoir un nom et un prénom avec
     * le premier caractère en majuscule et les autres en minuscule.
     */

    private String adesseParent;
    private Note note;
    private ArrayList<Note> listeNote = new ArrayList<>();

    public Etudiant(String login, String prenom, String nom) {
        super(login, prenom, nom);
    }

    public Etudiant(String login, String prenom, String nom, String adresse, String adesseParent) {
        super(login, prenom, nom, adresse);
        setAdresse(adresse, adesseParent);
    }

    public String getAdresse() {
        return super.getAdresse();
    }

    public String getAdesseparent() {
        return adesseParent;
    }

    // on met override car on redéfinit la méthode de la classe mère
    // sauf que la méthode de la classe mère est abstraite (donc on est obligé de la redéfinir)
    public String getMail() {
        return getPrenom() + "." + getNom() + "@etu.univ-grenoble-alpes.fr";
    }

    public Note getNote() {
        return note;
    }

    public void setNote() {
        this.note = new Note(ContrainteUtilitaire.saisir().getValeur());
        listeNote.add(note);
    }

    // attention, cette fonction sert uniquement pour faciliter les tests du tp3
    public void setRandomNote() {
        this.note = new Note((float) ( (int) ((Math.random() * 20) * 100) / 100));
        listeNote.add(note);
    }

    public void removeNote() {
        listeNote.remove(note);
    }

    public double getMoyenne() {
        double somme = 0;
        for (Note note : listeNote) {
            somme += note.getValeur();
        }
        return somme / listeNote.size();
    }

    // ici, il a une surchage de la méthode setAdresse.
    public void setAdresse(String adresse, String adesseparent) {
        setAdresse(adresse);
        this.adesseParent = adesseparent;
    }

    public boolean existAdresse() {
        return !getAdresse().isEmpty() || !adesseParent.isEmpty();
    }

    @Override
    public int compareTo(Etudiant etudiant) {
        if (this.getNom().compareTo(etudiant.getNom()) < 0) {
            return -1;
        } else if (this.getNom().compareTo(etudiant.getNom()) > 0) {
            return 1;
        } else {
            if (this.getPrenom().compareTo(etudiant.getPrenom()) < 0) {
                return -1;
            } else if (this.getPrenom().compareTo(etudiant.getPrenom()) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static final Comparator<Etudiant> compareEtudiantMoyenne = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant etudiant1, Etudiant etudiant2) {
            if (etudiant1.getMoyenne() < etudiant2.getMoyenne()) {
                return -1;
            } else if (etudiant1.getMoyenne() > etudiant2.getMoyenne()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

}
