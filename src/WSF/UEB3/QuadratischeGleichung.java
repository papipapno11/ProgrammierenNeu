package WSF.UEB3;

import java.util.Scanner;
public class QuadratischeGleichung {
    public static void main(String[]args) {

        // y = a * x^2 + b * x + c
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte den Parameter a ein: ");
        double a = scan.nextDouble();
        System.out.println("Geben Sie bitte den Parameter b ein: ");
        double b = scan.nextDouble();
        System.out.println("Geben Sie bitte den Parameter c ein: ");
        double c = scan.nextDouble();

        double diskriminante = Math.pow(b, 2) - 4 * a * c;

        if (diskriminante > 0) {
            System.out.println("Die quadratische Gleichung zwei Lösungen.");
            double x1 = (-b + Math.sqrt(diskriminante)) / 2 * a;
            double x2 = (-b - Math.sqrt(diskriminante)) / 2 * a;
            System.out.println("x1: " + x1 + "; x2: " + x2);

        }
        else if (diskriminante == 0) {
            System.out.println("Die quadratische Gleichung eine (doppelte) Lösungen.");
            double x = -b / 2 * a;
            System.out.println("x1/2: " + x);

        }
        else {
            System.out.println("Die quadratische Gleichung keine Lösung.");
        }
        scan.close();
    }
}