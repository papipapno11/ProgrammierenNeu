package WSF.UEB1;
import java.util.Scanner;

public class Baumarkt {
    public static void main(String[] args) {

        // in Cents
        int preisSchrauben = 5;
        int preisMuttern = 3;
        int preisUnterlegscheibe = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Schrauben ein: ");
        int anzahlSchrauben = scan.nextInt();
        System.out.println("Geben Sie die Anzahl der Mutter ein: ");
        int anzahlMuttern = scan.nextInt();
        System.out.println("Geben Sie die Anzahl der Unterlegscheiben ein: ");
        int anzahlUnterlegscheibe = scan.nextInt();


        int gesamtbetrag = (preisSchrauben * anzahlSchrauben) + (preisMuttern * anzahlMuttern) + (preisUnterlegscheibe * anzahlUnterlegscheibe);
        double centInEuro = gesamtbetrag / 100.0; // 222/100 = 2,22



        if (anzahlSchrauben > anzahlMuttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        }
        else {
            System.out.println("Die Bestellung ist okay.");
            System.out.println("Gesamtbetrag: " + gesamtbetrag + " Cents; " + centInEuro + " Euro");
        }
        scan.close();
    }
}