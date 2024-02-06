package Lek7;
import java.util.Scanner;

public class ArithmetischesMittel {
    public static double minimum (double[] zahlen) {

        /* statt zahlen.length hätte man auch "anzahl" in die Methode setzen können und
        nach demselben Prinzip implementieren können */
        double minimum = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < minimum) {
                minimum = zahlen[i];
            }
        }
        return minimum;
    }

    public static double maximum (double[] zahlen) {

        double maximum = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > maximum) {
                maximum = zahlen[i];
            }
        }
        return maximum;
    }

    public static double arithmetischesMittel (double[] zahlen) {

        double zaehler = 0.0;
        double nenner = zahlen.length;

        for (int i = 0; i < zahlen.length; i++) {
            zaehler += zahlen[i];
        }

        double ergebnis = zaehler / nenner;
        return ergebnis;
    }

    public static double standardabweichung (double[] zahlen) {

        // double zaehler = 0.0; auch möglich, jedoch muss Schleife angepasst werden
        double zaehler = 0.0;
        double nenner = zahlen.length;
        double mittelwert = arithmetischesMittel(zahlen);

        for (int i = 0; i < zahlen.length; i++) {
            zaehler += Math.pow((zahlen[i] - mittelwert), 2); // alle weiteren Elemente
        }

        double ergebnis = Math.sqrt(zaehler / nenner);
        return  ergebnis;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte: ");
        int anzahl = scan.nextInt();
        int anzahlCache = anzahl; // so bleibt "anzahl" unverändert & dient als Referenz; wenn etwas runtergezählt werden muss nutzbar!

        double [] zahlen = new double[anzahl];

        if (anzahl > 0) {
            while (anzahlCache > 0) { // läuft, solange bis alle Werte eingegeben und dem Array zugewiesen wurden
                for (int i = 1; i <= anzahl; i++) {
                    System.out.println(i + ". Wert: " );
                    double wert = scan.nextDouble();
                    zahlen[i-1] = wert; // eingegebene Werte von "wert" in das Array "zahlen" speichern
                    anzahlCache--;
                }
            }
        }
        else {
            scan.close();
            System.err.println("Die Anzahl der einzugebenden Werte muss größer als 0 sein.");
            System.exit(1); // Beendet das Programm mit einem Fehlercode (hier: 1)
            // throw new IllegalArgumentException("Die Anzahl der einzugebenden Werte muss größer 0 sein!");
        }

        // Ausgabe
        System.out.println("Kleinster Wert: " + minimum(zahlen));
        System.out.println("Größter Wert: " + maximum(zahlen));
        System.out.println("Arithmetisches Mittel: " + arithmetischesMittel(zahlen));
        System.out.println("Standardabweichung: " + standardabweichung(zahlen));

        scan.close();
    }
}