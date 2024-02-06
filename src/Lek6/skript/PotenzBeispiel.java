package Lek6.skript;

public class PotenzBeispiel {
    public static int potenz(int basis, int exponent) {

        int ergebnis = 1; //neutrales Element der Multiplikation
        for (int i = 1; i <= exponent; i++) {
            ergebnis = ergebnis * basis;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int ergebnis = potenz(3, 4);
        System.out.println(ergebnis);
    }
}