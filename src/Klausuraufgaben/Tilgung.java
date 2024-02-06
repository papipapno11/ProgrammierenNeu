package Klausuraufgaben;

public class Tilgung {

    public static int tilgung(double kontostand, double schuldzins, double tilgungsrate) {

        int anzahlJahre = 0;

        // in manchen Fällen wäre es schlau zinsProJahr vor der Schleife zu deklarieren
        while (kontostand > 0) {
            double zinsProJahr = kontostand * (schuldzins / 100.0); // 100.0, um Integer-Division zu umgehen
            kontostand = kontostand + zinsProJahr - tilgungsrate;

            anzahlJahre++;
            System.out.println("Kontostand nach " + anzahlJahre + " Jahre: " + kontostand);
        }

        return anzahlJahre;
    }

    public static void main(String[] args) {

        System.out.println("Anzahl Jahre: " + tilgung(10000.0, 5.0, 1000.0));
    }
}