package jeu;

public class GuerrierUtilitaire {
    static int de3() {
        return (int) (Math.random() * 3) + 1;
    }

    static int de3(int nombreLance) {
        int somme = 0;
        for (int i = 0; i < nombreLance; i++) {
            somme += de3();
        }
        return somme;
    }
}
