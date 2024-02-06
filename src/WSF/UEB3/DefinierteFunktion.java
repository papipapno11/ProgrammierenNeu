package WSF.UEB3;
import java.util.Scanner;

public class DefinierteFunktion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie den Grad der Funktion ein: ");
        int grad = scan.nextInt();

        double a, b, c, d, x;
        double ergebnis = 0.0;

        if (grad <= 3 && grad >= 1) {
            System.out.println("Geben Sie bitte den x-Wert der Funktion ein: ");
            x = scan.nextDouble();

            if (grad == 3) { // y = ax^3 + bx^c + cx + d
                System.out.println("Geben Sie bitte den Koeffizienten a ein: ");
                a = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten b ein: ");
                b = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten c ein: ");
                c = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten d ein: ");
                d = scan.nextDouble();

                ergebnis = a * x * x * x + b * x * x + c * x + d;
            }

            else if (grad == 2) { // y = ax^2 + bx + c
                System.out.println("Geben Sie bitte den Koeffizienten a ein: ");
                a = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten b ein: ");
                b = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten c ein: ");
                c = scan.nextDouble();

                ergebnis = a * x * x + b * x + c;
            }

            else if (grad == 1) { // y = ax + b
                System.out.println("Geben Sie bitte den Koeffizienten a ein: ");
                a = scan.nextDouble();

                System.out.println("Geben Sie bitte den Koeffizienten b ein: ");
                b = scan.nextDouble();

                ergebnis = a * x + b;
            }
            System.out.println("Der Funktionswert für die Funktion " + grad + ". Grades lautet: " + ergebnis);
        }

        else if (grad == 0) {// y = a
                System.out.println("Geben Sie bitte den Koeffizienten a ein: ");
                a = scan.nextDouble();
                ergebnis = a;
                System.out.println("Der Funktionswert für die Funktion " + grad + ". Grades lautet: " + ergebnis);
            }

        else {
            System.out.println("Dieses Programm ist nicht dafür ausgelegt Funktionen eines höheren Grades zu berechnen!");
        }
        scan.close();
    }
}