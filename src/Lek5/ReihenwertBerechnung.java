package Lek5;

public class ReihenwertBerechnung {
    public static void main(String[] args) {

        double summe = 0;
        double summand; // für Sichtbarkeit in while loop
        int k = 1;
        do
        {
            summand = 6 * (1.0/Math.pow(k, 2));
            summe = summe + summand;
            System.out.println(summe); // Ausgabe nach jedem Schleifendurchlauf
            k++;
        }
        while(summand > 1E-5);
        System.out.println("Ergebnis: " + summe); // einmalige Ausgabe nach Abbruch der Schleife
    }
}