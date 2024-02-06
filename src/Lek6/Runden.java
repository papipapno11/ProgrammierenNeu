package Lek6;

import java.util.Scanner;
public class Runden {
    public static int runden (double kommazahl) {

        //double nachkommaTeil = kommazahl - (int) kommazahl;
        double nachkommaTeil = (kommazahl % 1);
        int ergebnis = 0;

        if (nachkommaTeil > 0.0 && nachkommaTeil < 0.5) {
            ergebnis = (int) kommazahl;
        }
        else if (nachkommaTeil >= 0.5 && nachkommaTeil < 1) {
            //kommazahl++;
            //ergebnis = (int) kommazahl;
            ergebnis = (int) (kommazahl + 1);
        }
        return ergebnis;
    }

    public static double rundenAufNachkommastellen (double kommazahl, int anzahlStellen) {

        int faktor = 1;
        for (int i = 1; i <= anzahlStellen; i++) {
            faktor *= 10;
        }
        return kommazahl / faktor;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine positive Kommazahl ein: ");
        double kommazahl = scan.nextDouble();

        int result = runden(kommazahl);

        System.out.println("Geben Sie bitte die Anzahl der Nachkommastellen ein: ");
        int anzahlStellen = scan.nextInt();

        double resultKommastellen = rundenAufNachkommastellen(kommazahl, anzahlStellen);

        System.out.println("Kommazahl: " + kommazahl + "; Gerundet: " + result);
        System.out.printf(kommazahl + " auf " + anzahlStellen + " Nachkommastellen gerundet = " + resultKommastellen);

        scan.close();
    }
}