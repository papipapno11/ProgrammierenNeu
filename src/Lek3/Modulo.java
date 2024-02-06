package Lek3;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int zahl = scan.nextInt();

        int moduloOperator = 7;
        boolean zahlIstOk = true;
        int counter = 0;

        while (zahlIstOk && counter < 10) {
            if (zahl % moduloOperator == 0) {
                System.out.println("Ihre eingegebene Zahl ist ganzzahlig durch " + moduloOperator + " teilbar und das Ergebnis lautet: " + (zahl/moduloOperator));
                zahlIstOk = false;
            }
            else {
                System.out.println("Ihre Zahl ist nicht ganzzahlig durch " + moduloOperator + " teilbar. Bitte wiederholen Sie Ihre Eingabe: ");
                zahl = scan.nextInt();
            }
            counter++; // counter += 1;
        }
        System.out.println("Anzahl der Durchgänge: " + counter);
        scan.close();
    }
}