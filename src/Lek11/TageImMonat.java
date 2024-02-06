package Lek11;
import java.util.Scanner;

public class TageImMonat {

    public static int tageImMonat(String monat) {
        int tage = switch(monat) {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname"); // Ausgabe durch getMessage()
        };
        return tage;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isRight = false;
        do {
            try {
                System.out.println("Geben sie einen gültigen Monat ein: ");
                String monat = scan.nextLine();
                System.out.println("Der eingegebene Monat hat " + tageImMonat(monat) + " Tage.");
                isRight = true;
            }
            catch (RuntimeException e) {
                // wenn keine Ausnahme auftritt, wird der catch-Block übersprungen
                System.out.println(e.getMessage()); // gibt eine kurze Beschreibung der Ausnahme zurück
                isRight = false;
            }
        }
        while (!isRight);

        scan.close();
    }
}