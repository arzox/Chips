package jeu;

public class ChefFabio extends Fabio {
    public ChefFabio() {
        super();
    }

    @Override
    public void subitDegats(int degats) {
        setHealth(getHealth() - degats / 4);
    }
}
