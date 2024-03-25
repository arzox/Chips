package jeu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Chateau {
    final int RESSOURCES_INITIAL = 3;
    final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;
    boolean estBleu;
    public String color;
    LinkedList<Guerrier> guerriers = new LinkedList<>();
    Chateau(boolean estBleu) {
        this.estBleu = estBleu;
        ressources = RESSOURCES_INITIAL;
        color = estBleu ? "\033[0;34m" : "\033[0;31m";
    }
    public boolean estBleu() {
        return estBleu;
    }

    public int getRessources() {
        return ressources;
    }

    public void ajoutGuerrierNovice(Guerrier guerrier) {
        guerriers.add(guerrier);
        guerrier.setChateau(this);
    }
    public LinkedList<Guerrier> getGuerriersNovices() {
        return guerriers;
    }

    public ArrayList<Guerrier> entrainer() {
        // Retire le guerrier de la file d'attente si les ressources sont suffisantes
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();
        while(!guerriers.isEmpty() && guerriers.getFirst().getRessourcePourEntrainement() <= ressources) {
            ressources -= guerriers.getFirst().getRessourcePourEntrainement();
            guerriersEntraines.add(guerriers.poll());
        }
        return guerriersEntraines;
    }

    void incrementerRessources() {
        ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

    public void ajouterGuerrier() {
        int choix;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("0: Finir le tour | 1: Nain | 2: Elfe | 3: ChefNain | 4: ChefElfe");
            try {
                choix = scanner.nextInt();
                scanner.nextLine();
                switch (choix) {
                    case 1 -> ajoutGuerrierNovice(new Fabio());
                    case 2 -> ajoutGuerrierNovice(new Elfe());
                    case 3 -> ajoutGuerrierNovice(new ChefFabio());
                    case 4 -> ajoutGuerrierNovice(new ChefElfe());
                    case 0 -> System.out.println("Fin du tour");
                    default -> System.out.println("Choix invalide");
                }
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre valide");
                choix = -1;
                scanner.nextLine();
            }
        }
        while (choix != 0);
    }
}
