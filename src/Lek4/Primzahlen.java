package Lek4;
import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte zu untersuchende Zahl eingeben: ");
        int zahl = scan.nextInt();

        boolean isPrim = false;

        for (int i = 1; i <= zahl; i++) { // ist 1 bis eingabe eine Primzahl?
            isPrim = true; // man geht davon aus, dass es eine Primzahl ist
            for (int j = 2; i > j; j++) { // wir teilen alle Zahlen ganzzahlig mit i durch j; solange bis wir nicht mehr bei der Zahl sind
                if (i % j == 0) { // ist teilbar; solange if nicht betreten wird = Primzahl
                    isPrim = false; // wird if betreten = keine Primzahl
                    break;
                    /* bricht innere for-Schleife ab; z.B. 9 (Prim) ist nicht teilbar durch 2, aber 3 geht, jedoch Beweis für keine Prim,
                    also müssen die ganzen größeren Zahlen wie 4, 5, 6,.. nicht mehr überprüft werden */
                }
            }
            if (isPrim && i != 1) {
                System.out.println(i + " ist eine Primzahl!");
            }
            else {
                System.out.println(i + " ist keine Primzahl!");
            }
            scan.close();
        }
    }
}