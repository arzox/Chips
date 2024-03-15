package tp4.tabledemultiplication;

public class Multiplication {

    private int terme1;
    private int terme2;

    private Integer reponseUtilisateur;

    public Multiplication(int terme1, int terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;
    }

    public void setReponseUtilisateur(int reponseUtilisateur) {
        this.reponseUtilisateur = reponseUtilisateur;
    }

    public boolean isReponseJuste() {
        return reponseUtilisateur != null && reponseUtilisateur == terme1 * terme2;
    }

    @Override
    public String toString() {
        return terme1 + " * " + terme2 + " = ";
    }
}
