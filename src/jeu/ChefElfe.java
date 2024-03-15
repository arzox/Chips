package jeu;

public class ChefElfe extends Elfe {
    public ChefElfe() {
        super();
    }
    @Override
    public String getNom() {
        return "Chef " + super.getNom();
    }
    @Override
    public final int getRessourcePourEntrainement() {
        return 4;
    }
    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
