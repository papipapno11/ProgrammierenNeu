package WSF.UEB1;
import java.util.Scanner;

public class Wochenlohn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl Ihrer Wochenstunden ein: ");
        double anzahlArbeitsstunden = scan.nextDouble();
        System.out.println("Geben Sie die Anzahl Ihrer Überstunden ein: ");
        double anzahlUeberstunden = scan.nextDouble();
        System.out.println("Geben Sie Ihren Stundenlohn ein: ");
        double stundenlohn = scan.nextDouble();


        double ueberstundenzuschlag = 1.2 * stundenlohn;
        double wochenlohn = (anzahlArbeitsstunden * stundenlohn) + (anzahlUeberstunden * ueberstundenzuschlag);

        System.out.println("Ihr Wochenlohn lautet: " + wochenlohn + "€");
        scan.close();
    }
}