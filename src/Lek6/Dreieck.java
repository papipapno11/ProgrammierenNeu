package Lek6;
import java.util.Scanner;

public class Dreieck {
    public static String ausgabeDreieck (int zeilen) {

        String str = "";
        for (int i = 1; i <= zeilen; i++) { // kümmert sich um die Zeilen
            for (int j = 0; j < zeilen - i; j++) { // Leerzeichen abhängig von outer loop
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) { // kümmert sich um die Erzeugung der Sterne
                System.out.print("* ");
            }
            System.out.println(); // Nach jedem Durchlauf gehts zur nächsten Zeile
        }
        return str;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Anzahl der Zeilen an: ");
        int anzahlZeilen = scan.nextInt();

        String ergebnis = ausgabeDreieck(anzahlZeilen);
        System.out.println(ergebnis);

        scan.close();
    }
}