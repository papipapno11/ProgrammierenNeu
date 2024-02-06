package Lek3;
import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Ihr 1. Zeichen ein: ");
        char zeichenEins = scan.nextLine().charAt(0);
        System.out.println("Geben Sie Ihr 2. Zeichen ein: ");
        char zeichenZwei = scan.nextLine().charAt(0);

        int ausgabewert = -1;

        if (zeichenEins == 102 && zeichenZwei == 102) {
            ausgabewert = 0;
        }
        else if (zeichenEins == 102 && zeichenZwei == 116) {
            ausgabewert = 1;
        }
        else if (zeichenEins == 116 && zeichenZwei == 102) {
            ausgabewert = 2;
        }
        else if (zeichenEins == 116 && zeichenZwei == 116) {
            ausgabewert = 3;
        }
        else {
            throw new RuntimeException("Ihre Eingabe ist ungültig. Bitte wiederholen Sie den Prozess!");
        }

        if (ausgabewert != -1) {
            System.out.println("Ausgabewert: " + ausgabewert);
        }

        scan.close();
    }
}