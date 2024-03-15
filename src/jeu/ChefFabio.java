package jeu;

public class ChefFabio extends Fabio {
    public ChefFabio() {
        super();
    }
    @Override
    public int getRessourcePourEntrainement() {
        return 4;
    }
    @Override
    public String getNom() {
        return "Chef " + super.getNom();
    }

    @Override
    public void subitDegats(int degats) {
        setHealth(getHealth() - degats / 4);
    }
}
