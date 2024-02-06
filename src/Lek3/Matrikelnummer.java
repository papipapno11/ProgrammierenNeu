package Lek3;
import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie Ihre siebenstellige Matrikelnummer ein: ");
        int eingabe = scan.nextInt();

        boolean isCorrect = true;

        while (isCorrect) {
            if (!(eingabe <= 4999999 || eingabe >= 5200000 && eingabe <= 6099999 || eingabe >= 6200000)) {
                isCorrect = false;
                System.out.println("Das ist eine gültige Matrikelnummer. Vielen Dank!");
            } else {
                System.out.println("Ihre Eingabe ist fehlerhaft! Bitte geben Sie eine gültige Matrikelnummer ein: ");
                eingabe = scan.nextInt();
            }
        }
        scan.close();
    }
}