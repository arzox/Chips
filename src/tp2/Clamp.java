package tp2;

public class Clamp {
    double value;
    double min;
    double max;

    public static int clamp(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

    public static double clamp(double value, double min, double max) {
        return Math.min(Math.max(value, min), max);
    }

    public Clamp(double min, double max) {
        this.min = min;
        this.max = max;
        this.value = min;
    }

    public void setValue(double value) {
        this.value = clamp(value, min, max);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Clamp{" +
                "value=" + value +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
