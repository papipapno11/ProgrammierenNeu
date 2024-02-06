package Weiteres;

public class SchleifenX {
    public static void main(String[] args) {

        final int zeilen = 9;

        // Erste Schleife für die Anzahl der Zeilen
        for (int i = 0; i < zeilen; ++i) {
            // Zweite Schleife für die Position der 'o's
            for (int j = 0; j < zeilen; ++j) {
                // Das erste 'o' an der ersten und letzten Position setzen
                if (j == i || j == zeilen - 1 - i) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}