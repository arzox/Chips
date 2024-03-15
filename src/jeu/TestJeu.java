package jeu;

public class TestJeu {
    public static void main(String[] args) {
        Plato plato = new Plato(3);
        plato.chateauRouge.ajoutGuerrierNovice(new Elfe());
        plato.chateauRouge.ajoutGuerrierNovice(new Fabio());
        plato.chateauBleu.ajoutGuerrierNovice(new ChefElfe());
        plato.chateauBleu.incrementerRessources();
        plato.afficheCarreaux();
        plato.deplaceGuerriers();
        plato.afficheCarreaux();
        plato.deplaceGuerriers();
        plato.afficheCarreaux();
        plato.lanceCombats();
        plato.afficheCarreaux();
    }
}
