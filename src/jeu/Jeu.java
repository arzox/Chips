package jeu;

import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        Plato plato = initPlato();

        while (plato.getWinner() == null) {
            plato.initTour();
            plato.deplaceGuerriers();
            plato.lanceCombats();
            plato.afficheCarreaux();
        }

        System.out.println("Le gagnant est : " + plato.getWinner().color + (plato.getWinner().estBleu ? "Bleu" : "Rouge"));
    }

    private static Plato initPlato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du plateau : ");
        int size = scanner.nextInt();
        return new Plato(size);
    }
}
