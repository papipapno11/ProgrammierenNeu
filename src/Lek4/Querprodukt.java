package Lek4;
import java.util.Scanner;

public class Querprodukt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Zahl ein: ");
        int eingabe = scan.nextInt();

        int querprodukt = 1;

        while (eingabe <= 0 || eingabe > 1000000) {
            System.out.println("FEHLER – Zahl ist ungültig.");
            System.out.println("Geben Sie bitte eine Zahl ein: ");
            eingabe = scan.nextInt();
        }

        int zahl = eingabe;
        while (eingabe >= 1 && eingabe <= 1000000) {
            // zahl
            while (eingabe > 0) {
                int letzteZiffer = eingabe % 10;
                querprodukt *= letzteZiffer;
                eingabe /= 10; // letzte Ziffer abschneiden
            }
        }
        System.out.println("Das Querprodukt der Zahl " + zahl + " beträgt " + querprodukt);
        scan.close();
    }
}