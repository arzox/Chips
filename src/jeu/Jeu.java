package jeu;

import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        // Boucle du jeu
        Plato plato = initPlato();
        while (plato.getWinner() == null) {
            plato.initTour();
            plato.deplaceGuerriers();
            plato.afficheCarreaux();
            plato.subitFleches();
            plato.lanceCombats();
            plato.afficheCarreaux();
        }
        System.out.println("Le gagnant est : " + plato.getWinner().color + (plato.getWinner().estBleu ? "Bleu" : "Rouge"));
    }

    private static Plato initPlato() {
        // demande la taille du plato
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.print("Entrez la taille du plateau : ");
            try {
                size = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("La taille doit être supérieur à 3");
            }
        } while (size < 3);

        return new Plato(size);
    }
}
