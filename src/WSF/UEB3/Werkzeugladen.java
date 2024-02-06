package WSF.UEB3;
import java.util.Scanner;

public class Werkzeugladen {
    public static void main(String[] args) {

        // Preise in Cent
        int preisProSchraube = 5;
        int preisProMutter = 3;
        int preisProUnterlegscheibe = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Anzahl der Schrauben ein: ");
        int anzahlSchrauben = scan.nextInt();
        System.out.println("Geben Sie bitte die Anzahl der Muttern ein: ");
        int anzahlMuttern = scan.nextInt();
        System.out.println("Geben Sie bitte die Anzahl der Unterlegscheiben ein: ");
        int anzahlUnterlegscheiben = scan.nextInt();

        int gesamtbetrag = preisProSchraube * anzahlSchrauben + preisProMutter * anzahlMuttern + preisProUnterlegscheibe * anzahlUnterlegscheiben;

        if (anzahlSchrauben > anzahlMuttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung");
        }
        else {
            System.out.println("Die Bestellung ist okay.");
        }
        System.out.println("Gesamtbetrag: " + gesamtbetrag + " Cents");
        scan.close();
    }
}