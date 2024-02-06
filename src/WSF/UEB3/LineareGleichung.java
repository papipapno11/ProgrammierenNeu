package WSF.UEB3;
import java.util.Scanner;

public class LineareGleichung {
    public static void main(String[] args) {

        // y = a*x + b
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte den Parameter a ein: ");
        double a = scan.nextDouble();
        System.out.println("Geben Sie bitte den Parameter b ein: ");
        double b = scan.nextDouble();
        System.out.println("Geben Sie bitte den Funktionswert y ein: ");
        double y = scan.nextDouble();

        double x;

        if (a != 0) {
            x = (y - b) / a;
            System.out.println("Der Wert für die Variable x lautet: " + x);
        }
        else {
            if (y == b) {
                x = (y - b) / a;
                System.out.println("Die Gerade hat unendlich viele Lösungen.");
                System.out.println("Der Wert für die Variable x lautet: " + x);
            }
            else {
                System.out.println("Die Gerade hat keine Lösung.");
            }
        }
        scan.close();
    }
}