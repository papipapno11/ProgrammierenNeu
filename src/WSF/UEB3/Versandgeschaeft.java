package WSF.UEB3;
import java.util.Scanner;

public class Versandgeschaeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Höhe des Rechnungsbetrags ein: ");
        double betrag = scan.nextDouble();

        double verpackungszuschlag;
        double portoanteil;
        double gesamtpreis = 0.0;

        if (betrag <= 100) {
            verpackungszuschlag = 3.0;
            portoanteil = 2.0;
        }
        else if (betrag > 100 && betrag <= 200) {
            verpackungszuschlag = 2.0;
            portoanteil = 0.0;
        }
        else {
            verpackungszuschlag = 0.0;
            portoanteil = 0.0;
        }
        gesamtpreis = betrag + verpackungszuschlag + portoanteil;
        System.out.println("Gesamtpreis: " + gesamtpreis + " Euro");
        scan.close();
    }
}