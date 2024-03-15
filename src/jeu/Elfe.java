package jeu;

public class Elfe extends Guerrier {
    public Elfe() {
        super();
    }
    @Override
    public String getNom() {
        return "Elfe";
    }

    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
