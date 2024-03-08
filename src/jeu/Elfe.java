package jeu;

public class Elfe extends Guerrier {
    public Elfe() {
        super();
    }

    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
