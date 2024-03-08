package jeu;

public class Fabio extends Guerrier {
    public Fabio() {
        super();
    }

    @Override
    public void subitDegats(int degats) {
        setHealth(getHealth() - degats / 2);
    }
}
