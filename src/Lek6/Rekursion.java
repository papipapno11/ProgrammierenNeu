package Lek6;
import java.util.Scanner;

public class Rekursion {

    public static int potenz (int basis, int exponent) {

        if (exponent == 0) { // Abbruchkriterium
            return 1; // z.B. 5^0 == 1
        }
        // z.B. 5^4
        return basis * potenz(basis, exponent - 1); // recursion call
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Basis ein: ");
        int basis = scan.nextInt();
        System.out.println("Geben Sie bitte den Exponenten ein: ");
        int exponent = scan.nextInt();

        int ergebnis = potenz(basis, exponent);

        System.out.println("Das Ergebnis aus Basis " + basis + " und Exponent " + exponent + " lautet: " + ergebnis);

        scan.close();
    }
}