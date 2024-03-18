package jeu;

import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        Plato plato = initPlato();
        while (plato.getWinner() == null) {
            plato.initTour();
            plato.deplaceGuerriers();
            plato.afficheCarreaux();
            plato.subitFleches();
            plato.afficheCarreaux();
            plato.lanceCombats();
            plato.afficheCarreaux();
        }
        System.out.println("Le gagnant est : " + plato.getWinner().color + (plato.getWinner().estBleu ? "Bleu" : "Rouge"));
    }

    private static Plato initPlato() {
        // demande la taille du plato
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du plateau : ");
        int size = 0;
        do {
            try {
                size = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("La taille doit être supérieur à 3");
            }
        } while (size < 3);

        return new Plato(size);
    }
}
