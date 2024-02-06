package Klausuraufgaben.SS2020;

public class Log {

    public static double logs(double x) {

        if (x < 0 || x > 2) {
            throw new RuntimeException();
        }

        double ergebnis = 0.0;
        double grenze = 1E-16;
        double vorherigesErgebnis = x;
        int n = 1;

        while (vorherigesErgebnis >= grenze) {
            vorherigesErgebnis += (potenz((-1), (n + 1)) / n) * potenz((x - 1), n);

            ergebnis += vorherigesErgebnis;
            n++;
        }

        return ergebnis;
    }

    public static double potenz(double basis, double exponent) {

        double result = 1.0;
        while (exponent > 0) {
            result *= basis;
            exponent--;
        }

        return result;
    }

    // nicht in Aufgabe gefragt
    public static void main(String[] args) {

        double x = 1.6;
        try {
            double value = logs(x);
            System.out.println("ln(" + x + ") = " + value);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}