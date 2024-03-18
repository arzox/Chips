package jeu;

public class Elfe extends Guerrier {
    public static final int FORCE = 10;

    public Elfe() {
        super();
    }
    @Override
    public String getNom() {
        return "Elfe";
    }
    @Override
    public int getForce() {
        return super.getForce();
    }

    @Override
    public int getRessourcePourEntrainement() {
        return super.getRessourcePourEntrainement() * 2;
    }
}
