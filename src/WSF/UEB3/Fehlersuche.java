package WSF.UEB3;

import java.util.Scanner;
public class Fehlersuche {
    public static void main(String[] args) {
        int kundennummer, anzahl;
        double preis, gesamtPreis;

        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Kundennummer ein: ");
        kundennummer = input.nextInt();

        System.out.print("Geben Sie die Anzahl ein: ");
        anzahl = input.nextInt();

        System.out.print("Geben Sie den Stückpreis ein: ");
        preis = input.nextDouble();

        gesamtPreis = preis * anzahl;

        if (kundennummer < 100) {
            gesamtPreis = gesamtPreis * 0.95;
        }

        if (anzahl < 20) {
            gesamtPreis = gesamtPreis + 15;
        }
        else if (anzahl < 50) {
            gesamtPreis = gesamtPreis + 5;
        }
        System.out.println("Gesamtpreis: " + gesamtPreis);
        input.close();
    }
}