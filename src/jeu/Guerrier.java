package jeu;

public abstract class Guerrier {
    final int FORCE_BASE = 10;
    final int PV_MAX_BASE = 100;
    final int RESSOURCE_BASE = 1;
    int  health;
    Chateau chateau;

    Guerrier() {
        health = PV_MAX_BASE;
    }

    public int getForce() {
        return FORCE_BASE;
    }

    public int getHealth() {
        return health;
    }

    public int getRessourcePourEntrainement() {
        return RESSOURCE_BASE;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
    }

    public boolean estBleu() {
        return chateau.estBleu();
    }

    public boolean estVivant() {
        return health > 0;
    }

    public void attaque(Guerrier adversaire) {
        adversaire.subitDegats(getForce());
    }

    public void subitDegats(int degats) {
        setHealth(getHealth() - degats);
    }
}
