package WSF.UEB1;
import java.util.Scanner;

public class Maklerfirma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Grundstücks (in Meter) ein: ");
        double laenge = scan.nextDouble();
        System.out.println("Geben Sie die Breite des Grundstücks (in Meter) ein: ");
        double breite = scan.nextDouble();
        System.out.println("Geben Sie den Quadratmeterpreis des Grundstücks ein: ");
        double quadratmeterpreis = scan.nextDouble();


        System.out.println("Rechnung: ");
        System.out.println("-------------------------------------");
        System.out.println("Länge des Grundstücks: " + laenge + " Meter");
        System.out.println("Breite des Grundstücks: " + breite + " Meter");
        System.out.println("Quadratmeterpreis: " + quadratmeterpreis + "€");

        double grundstueckpreis = laenge * breite * quadratmeterpreis;
        System.out.println("Grundstückpreis: " + grundstueckpreis + "€");

        double maklergebuehr = 0.03 * grundstueckpreis;
        System.out.println("Maklergebühr (3%): " + maklergebuehr + "€");

        double mehrwertsteuer = 0.19 * grundstueckpreis;
        System.out.println("Mehrwertsteuer (19%): " + mehrwertsteuer + "€");

        double gesamtbetrag = grundstueckpreis + maklergebuehr + mehrwertsteuer;
        System.out.println("Gesamtbetrag: " + gesamtbetrag + "€");

        scan.close();
    }
}