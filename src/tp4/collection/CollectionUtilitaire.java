package tp4.collection;

import java.util.ArrayList;

public class CollectionUtilitaire {

    public static void afficheCollection(String message, ArrayList<Integer> liste) {
        System.out.println(message);
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }

}
