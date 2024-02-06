package WSF.UEB2;

import java.util.Scanner;

public class Dreiecke {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Längen der drei Seiten eines Dreiecks: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        // Ergeben die drei eingegebenen Seiten überhaupt ein Dreieck?
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Die eingegebenen Seiten bilden ein Dreieck."); // "Eine Seite eines Dreiecks ist kleiner als die Summe der beiden anderen"
        }
        // Liegt ein gleichseitiges Dreieck vor?
        if (a == b || a == c || b == c) { // gleichseitiges Dreieck: alle Seiten sind gleich lang
            System.out.println("Es liegt ein gleichseitiges Dreieck vor.");
        }
        else {
            System.out.println("Es liegt kein gleichseitiges Dreieck vor.");
        }
        // Liegt ein rechtwinkliges Dreieck vor?
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) { // rechtwinkliges Dreieck: Winkelsumme in Dreieck 180°, rechten Winkel (90°) & beide weitere Seiten = 90°
            System.out.println("Es liegt ein rechtwinkliges Dreieck vor.");
        }
        else {
            System.out.println("Es liegt kein rechtwinkliges Dreieck vor.");
        }
        scan.close();
    }
}