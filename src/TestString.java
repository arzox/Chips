import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {
        //on initialise un scanner
        Scanner entree = new Scanner(System.in);
        System.out.print("Etrez une chaine : ");
        String maChaine = entree.nextLine();
        System.out.println(maChaine);
        System.out.println(maChaine.length());
        System.out.println(maChaine.toUpperCase());
        System.out.println("Entrez une deuxième chaine");
        String deuxiemeChaine = entree.nextLine();
        maChaine.replace(" ", "");
        System.out.println(deuxiemeChaine.equalsIgnoreCase(maChaine));
        System.out.println(maChaine.equals(maChaine.toLowerCase()));
        System.out.println(maChaine.toUpperCase());
        StringBuilder maChainereverse = new StringBuilder(maChaine).reverse();
        System.out.println(maChaine.contentEquals(maChainereverse));
    }
}
