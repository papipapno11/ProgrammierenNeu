package Lek5;
import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die Basis b ein: ");
        double b = scan.nextDouble();
        System.out.println("Geben Sie den Exponenten n ein: ");
        int n = scan.nextInt();

        double ergebnis = 1; // neutrales Element bei Multiplikation
        int x = 0; // Zählvariable

        // Beispiel: b^n ; 7^3 = 7*7*7
        if (n > 0) {
            while (x < n) {
                ergebnis = ergebnis * b;
                x++;
            }
        }
        // Beispiel: b^n ; 7^0 = 1
        if (n == 0) {
            ergebnis = 1;
        }
        // Beispiel: b^n ; 7^-3 = 1 / 7*7*7
        if (n < 0) {
            while (x > n) {
                ergebnis = ergebnis * b;
                x--;
            }
            ergebnis = 1 / ergebnis;
        }
        System.out.println("Die Potenz aus " + b + "^" + n + " lautet " + ergebnis);
        scan.close();
    }
}