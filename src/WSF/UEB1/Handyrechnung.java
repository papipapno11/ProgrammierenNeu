package WSF.UEB1;
import java.util.Scanner;

public class Handyrechnung {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der gesendeten SMS ein: ");
        int anzahlSMS = scan.nextInt();
        System.out.println("Geben Sie die Anzahl der gesendeten MMS ein: ");
        int anzahlMMS = scan.nextInt();


        double grundgebuehr = 5.99;
        double preisProSMS = 0.19;
        double preisProMMS = 0.29;

        double monatlicheKosten = grundgebuehr + (anzahlSMS * preisProSMS) + (anzahlMMS * preisProMMS);
        System.out.println("Monatliche Gesamtkosten: " + monatlicheKosten + " €");

        scan.close();
    }
}