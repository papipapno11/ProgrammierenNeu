package WSF.UEB3;
import java.util.Scanner;

public class Gewicht {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie das Geschlecht (m/w) ein: ");
        char geschlecht = scan.nextLine().charAt(0);
        System.out.println("Geben Sie das Alter ein: ");
        int alter = scan.nextInt();
        System.out.println("Geben Sie das Gewicht ein: ");
        double gewicht = scan.nextDouble();
        System.out.println("Geben Sie die Körpergröße in cm ein: ");
        double groesse = scan.nextDouble();

        // 176 cm == 76 kg
        double sollwert = groesse - 100.0;

        if (alter > 17 && groesse > 120) {
            if (geschlecht == 'w') {
                double minGewicht = sollwert * 0.93;
                double maxGewicht = sollwert * 1.04;

                // &&: Schwelle zwischen diesen Werten -> bspw. 74(min) <= 78(gewicht) <= 82(max); ||: entweder oder
                if (gewicht <= maxGewicht && gewicht >= minGewicht) {
                    System.out.println("Normalgewicht!");
                }
                if (gewicht < minGewicht) {
                    System.out.println("Untergewicht!");
                }
                else {
                    System.out.println("Übergewicht!");
                }
            }
            else if (geschlecht == 'm') {
                double minGewicht = sollwert * 0.95;
                double maxGewicht = sollwert * 1.05;

                if (gewicht <= maxGewicht && gewicht >= minGewicht) {
                    System.out.println("Normalgewicht!");
                }
                if (gewicht < minGewicht) {
                    System.out.println("Untergewicht!");
                }
                else {
                    System.out.println("Übergewicht!");
                }
            }
            else {
                System.out.println("Kein gültiges Geschlecht!");
            }
        }
        else {
            System.out.println("Leider können keine Angaben gemacht werden!");
        }
        scan.close();
    }
}