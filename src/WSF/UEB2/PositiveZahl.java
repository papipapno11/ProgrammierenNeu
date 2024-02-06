package WSF.UEB2;
import java.util.Scanner;

public class PositiveZahl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine positive integer-Zahl ein: ");
        int zahl = scan.nextInt();

        // Überprüfung, ob die Zahl positiv, negativ oder 0 ist
        if (zahl > 0) {
            System.out.println("Die eingegebene Zahl ist positiv und lautet: " + zahl);
        }
        else if (zahl < 0) {
            System.out.println("Die eingegebene Zahl ist negativ und lautet: " + zahl);
        }
        else {
            System.out.println("Die eingegebene Zahl ist neutral und lautet: " + zahl);
        }

        // Überprüfung, ob die Zahl gerade oder ungerade ist
        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        }
        else {
            System.out.println("Die Zahl ist ungerade.");
        }
        scan.close();
    }
}