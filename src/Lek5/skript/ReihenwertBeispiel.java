package Lek5.skript;

public class ReihenwertBeispiel {
    public static void main(String[] args) {

        double summe = 0; // neutrales Element einer Addition
        double summand; // für Sichtbarkeit in while loop
        int k = 0; // Zählvariable

        do {
            // WIEDERHOLE diese Bedingung
            summand = 1.0 / Math.pow(3, k); // Berechnung des (k+1)-ten Summanden
            summe = summe + summand;
            k++;
        }
        while (summand > 1E-10); // 10 Nachkommastellen; 0.0000000001
        System.out.println(summe);
    }
}