package WSF.UEB2;
import java.util.Scanner;

public class iKauf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihr Auftragswert ein: ");
        int auftragswert = scan.nextInt();

        double versandkostenpauschale = 0;
        double summe = 0;

        if (auftragswert < 100) {
            versandkostenpauschale = 3.50;
            summe = auftragswert + versandkostenpauschale;
        }

        if (auftragswert >= 100 && auftragswert < 200) {
            versandkostenpauschale = 0;
            summe = auftragswert + versandkostenpauschale;
        }

        if (auftragswert >= 200) {
            summe = auftragswert * 0.98;
        }

        System.out.println("Rechnungsendbetrag: " + summe + "€");
        scan.close();
    }
}