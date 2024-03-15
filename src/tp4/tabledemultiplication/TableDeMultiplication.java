package tp4.tabledemultiplication;

import java.util.ArrayList;
import java.util.Collections;

public class TableDeMultiplication {

    private int nombreTable;

    private ArrayList<Multiplication> multiplications = new ArrayList<>();

    private int nbrepJustes = 0;
    private final int TABLE_MIN = 1;
    private final int TABLE_MAX = 10;

    public TableDeMultiplication(int nombreTable, boolean estMelange) {
        this.nombreTable = nombreTable;
        initialisation();
        if (estMelange) {
            melange();
        }
    }

    public void incrementerReponsesJustes() {
        nbrepJustes++;
    }

    public void initialisation() {
        if(nombreTable >= TABLE_MIN && nombreTable <= TABLE_MAX) {
            for (int i = TABLE_MIN; i <= TABLE_MAX; i++) {
                multiplications.add(new Multiplication(nombreTable, i));
            }
        }
    }

    public void melange() {
        Collections.shuffle(multiplications);
    }

    public Multiplication getMultiplication(int index) {
        return multiplications.get(index);
    }

    public int getNombreReponsesJustes() {
        return nbrepJustes;
    }

    public int getNombreMultiplications() {
        return multiplications.size();
    }



}
