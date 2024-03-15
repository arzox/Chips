package jeu;

public class Fabio extends Guerrier {
    public Fabio() {
        super();
    }

    @Override
    public String getNom() {
        return "Nain";
    }

    @Override
    public void subitDegats(int degats) {
        setHealth(getHealth() - degats / 2);
    }
}
