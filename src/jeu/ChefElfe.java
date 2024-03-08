package jeu;

public class ChefElfe extends Elfe {
    public ChefElfe() {
        super();
    }

    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
