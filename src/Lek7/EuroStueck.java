package Lek7;

public class EuroStueck {
    public static double wahrscheinlichkeit () {

        int anzahlVersuche = 10000; // Anzahl Durchläufe
        int anzIstInSchublade3 = 0; // Zählvariable für Schublade
        int counter = 0; // Zählvariable

        while (counter < anzahlVersuche) {

            double zufallSchreibtisch = Math.random(); // Zahl zwischen 0.0 bis 0.99
            //double zufallSchreibtisch = Math.round(Math.random()); // 0 oder 1; 50% Wsk.

            int zufallSchublade = (int) (Math.random() * 3 + 1); // 1, 2 oder 3

            // if (zufallSchreibtisch == 1d) wenn Zufallszahl zwischen 0 oder 1
            if (zufallSchreibtisch <= 0.5) {
                if (zufallSchublade == 3) {
                    anzIstInSchublade3++;
                    counter++;
                }
            }
            else {
                counter++;
            }
        }
        /* wenn (double) außerhalb der Klammern deklariert wird, findet eine Ganzzahldivision
        statt und das Ergebnis wird abgerundet */
        double wahrscheinlichkeit = ((double) anzIstInSchublade3 / anzahlVersuche) * 100;
        return wahrscheinlichkeit;
    }

    public static void main(String[] args) {

        System.out.println("Die Wahrscheinlichkeit nach 10.000 Durchläufe lautet: " + wahrscheinlichkeit() + " %");
    }
}