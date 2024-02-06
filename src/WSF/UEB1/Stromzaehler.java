package WSF.UEB1;
import java.util.Scanner;

public class Stromzaehler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den aktuellen Zählerstand ein: ");
        int aktuellerZaehlerstand = scan.nextInt();
        System.out.println("Geben Sie den derzeitigen kWh-Preis ein: ");
        double kwhPreis = scan.nextDouble();
        System.out.println("Geben Sie den Verbrauch des letzten Jahres ein: ");
        int verbrauchLetztesJahr = scan.nextInt();
        System.out.println("Geben Sie den gezahlten monatlichen Abschlag vom letzten Jahr ein: ");
        double monatlicherAbschlag = scan.nextDouble();


        double kosten = kwhPreis * verbrauchLetztesJahr;
        double differenz = kosten - (monatlicherAbschlag * 12);
        double neuerAbschlag = kosten / 12;

        System.out.println("\n--- Stromabrechnung ---");
        System.out.println("Verbrauch des letzten Jahres: " + verbrauchLetztesJahr + " kWh");
        System.out.println("Kosten des letzten Jahres: " + kosten + " Euro");
        System.out.println("Differenz zur monatlichen Abschlagszahlung: " + differenz + " Euro");
        System.out.println("Neuer monatlicher Abschlag für das nächste Jahr: " + neuerAbschlag + " Euro");

        scan.close();
    }
}