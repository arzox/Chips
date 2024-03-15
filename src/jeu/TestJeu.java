package jeu;

import java.util.Scanner;

public class TestJeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du plateau : ");
        try {
            int size = scanner.nextInt();
            System.out.println(size);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    public void test() {
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
