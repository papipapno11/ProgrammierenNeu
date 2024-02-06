package Klausuraufgaben;

public class BerechneReihe {
    public static void main(String[] args) {

        for (int k = 1; k <= 2000; k++) {
            double zaehler = potenz((-1.0), (k + 1));
            double nenner = k;
            double ergebnis = zaehler / nenner;
            System.out.print(ergebnis + ", ");
        }
    }

    public static double potenz(double b, double e) {

        double result = 1.0;
        while (e > 0) {
            result *= b;
            e--;
        }

        return result;
    }
}