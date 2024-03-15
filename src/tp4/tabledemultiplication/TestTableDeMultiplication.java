package tp4.tabledemultiplication;

import java.util.Scanner;
import java.util.TreeSet;

public class TestTableDeMultiplication {

    public static void main(String[] args) {

        Scanner lecteur = new Scanner(System.in);

        int nombre;

        do {
            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nombre = lecteur.nextInt();
            lecteur.nextLine();
        } while (nombre < 1 || nombre > 10);

        int typeExo;

        do {
            System.out.print("Entrez 1 pour un entrainement ordonné ou 2 pour un exercice mélangé : ");
            typeExo = lecteur.nextInt();
            lecteur.nextLine();
        } while (typeExo < 1 || typeExo > 2);

        boolean estMelange = typeExo == 2;

        TableDeMultiplication table = new TableDeMultiplication(nombre, estMelange);
        for (int i = 0; i < table.getNombreMultiplications(); i++) {
            System.out.print(table.getMultiplication(i));
            table.getMultiplication(i).setReponseUtilisateur(lecteur.nextInt());
            if (table.getMultiplication(i).isReponseJuste()) {
                table.incrementerReponsesJustes();
            }
        }
        TreeSet<Multiplication> multiplications = new TreeSet<>();
        System.out.println("Vous avez " + table.getNombreReponsesJustes() + " bonnes réponses sur " + table.getNombreMultiplications());
    }

}
