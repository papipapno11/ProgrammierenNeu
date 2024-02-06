package Lek11;
import java.util.Scanner;

public class UeberladenDerBetragsmethode {

    public static int berechneBetrag(int wert) {

        if(wert < 0) { // z.B. -5 -> Vorzeichenwechsel
            wert *= -1; // (-5) * (-1) = 5
        }
        return wert;
    }

    public static float berechneBetrag(float wert) {

        if(wert < 0) {
            wert *= -1;
        }
        return wert;
    }

    public static double berechneBetrag(double wert) {

        if(wert < 0) {
            wert *= -1;
        }
        return wert;
    }

    public static short berechneBetrag(short wert) {

        if(wert < 0) { // Berechnungen finden (in Java) mit int statt und anschließend type casting zu short
            wert = (short) (wert * (- 1));
        }
        return wert;
    }

    public static long berechneBetrag(long wert) {

        if(wert < 0) {
            wert *= -1;
        }
        return wert;
    }

    public static void main(String[] args) {

        int menuwahl;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Welchen Datentyp möchten Sie übergeben?\nMenu:\n"
                    + "1. Integer\n"
                    + "2. Float\n"
                    + "3. Double\n"
                    + "4. Short\n"
                    + "5. Long\n"
                    + "6. Keinen: Das Programm beenden!\n" + "Ihre Eingabe:");

            try {
                menuwahl = scanner.nextInt();
                switch (menuwahl) {
                    case 1:
                        System.out.print("Geben Sie einen Integer ein:");
                        int i = scanner.nextInt();
                        System.out.println("Der Betrag vom Integer " + i + " = " + berechneBetrag(i) + "\n");
                        break;
                    case 2:
                        System.out.print("Geben Sie einen Float ein:");
                        float f = scanner.nextFloat();
                        System.out.println("Der Betrag vom Float " + f + " = " + berechneBetrag(f) + "\n");
                        break;
                    case 3:
                        System.out.print("Geben Sie einen Double ein:");
                        double d = scanner.nextDouble();
                        System.out.println("Der Betrag vom Double " + d + " = " + berechneBetrag(d) + "\n");
                        break;
                    case 4:
                        System.out.print("Geben Sie einen Short ein:");
                        short s = scanner.nextShort();
                        System.out.println("Der Betrag vom Short " + s + " = " + berechneBetrag(s) + "\n");
                        break;
                    case 5:
                        System.out.print("Geben Sie einen Long ein:");
                        long l = scanner.nextLong();
                        System.out.println("Der Betrag vom Long " + l + " = " + berechneBetrag(l) + "\n");
                        break;
                    case 6:
                        System.out.println("Das Programm wird nun beendet!");
                        System.exit(0);
                    default:
                        throw new IllegalArgumentException("Ungültige Eingabe. Bitte wählen Sie erneut.");
                }
            }
            catch (RuntimeException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Zahl oder Option ein.");
                scanner.nextLine(); // Scanner-Puffer leeren
                menuwahl = 0; // Um die Schleife erneut auszuführen
            }
        }
        while (menuwahl != 6);
        scanner.close();
    }
}