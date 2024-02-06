package Lek6;
import java.util.Scanner;

public class Spruenge {

    public static int springeInMehrerenSpruengen (int distanz, int sprungEins, int sprungZwei) {

        // Abbruchkriterium
        if (distanz == 0) {
            return 1;
        } else if (distanz < 0) {
            return 0;
        } else {
            // Berechnung der Möglichkeiten unter Berücksichtigung beider Sprungweiten
            int moeglichkeiten1 = springeInMehrerenSpruengen(distanz - sprungEins, sprungEins, sprungZwei);
            int moeglichkeiten2 = springeInMehrerenSpruengen(distanz - sprungZwei, sprungEins, sprungZwei);
            // Problem, das immer kleiner wird -> Diszanz - sprung

            return moeglichkeiten1 + moeglichkeiten2; // Summe der Möglichkeiten
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Distanz ein: ");
        int distanz = scan.nextInt();
        System.out.println("Geben Sie bitte die erste Sprungweite ein: ");
        int sprungEins = scan.nextInt();
        System.out.println("Geben Sie bitte die zweite Sprungweite ein: ");
        int sprungZwei = scan.nextInt();

        int ergebnis = springeInMehrerenSpruengen(distanz, sprungEins, sprungZwei);

        System.out.println("Die Anzahl der Möglichkeiten beträgt: " + ergebnis);

        scan.close();
    }
}