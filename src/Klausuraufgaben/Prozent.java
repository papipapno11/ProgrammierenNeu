package Klausuraufgaben;

public class Prozent {
    public static double berechnePotenz(int a, int b) {

        double result = 0.0;

        if (a >= 0 && b >= 0) {
            result = (a / 100.0) * b;
            return result;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {

        double ergebnis = berechnePotenz(130, 20);
        System.out.println(ergebnis);

        double ergebnis2 = berechnePotenz(130, 40);
        System.out.println(ergebnis2);

        double ergebnis3 = berechnePotenz(-4, 455);
        System.out.println(ergebnis3);
    }
}