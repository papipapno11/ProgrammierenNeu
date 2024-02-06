package Klausuraufgaben;
import java.util.Scanner;

public class ISBN {
    public static boolean pruefeISBN(String isbn) {

        /*
        if (isbn.length() != 10) {
            System.out.println("ISBN muss genau 10 Zeichen haben.");
            return false;
        }
         */

        String ohneBindestriche = isbn.replace("-", "");

        int summe = 0;
        for (int i = 0; i < 10; i++) {
            int zahl = ohneBindestriche.charAt(i) - '0'; // Konvertierung String zu int

            summe = summe + zahl * (i + 1); // 5*1 + 2*2 + 3*3, usw.
        }

        if (summe % 11 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Ihre 10-ziffrige ISBN ein: ");
        String isbn = scan.nextLine();

        if (pruefeISBN(isbn)) {
            System.out.println("Ihre ISBN ist gültig!");
        }
        else {
            System.out.println("Ihre ISBN ist ungültig!");
        }

        scan.close();
    }
}