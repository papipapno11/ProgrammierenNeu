package Lek11;
import java.util.Scanner;

public class ZeilenMaximum {
    public static double[] zeilenMaxima(double[][] array) {

        double[] maximumArray = new double[array.length];
        double maximum = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Maximum
                if (maximum < array[i][j]) {
                    maximum = array[i][j];
                }
            }
            // Speichern in maximumArray
            maximumArray[i] = maximum;
            maximum = Double.MIN_VALUE;;
        }

        return maximumArray;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Anzahl der Zeilen ein: ");
        int anzahlZeilen = scanner.nextInt();
        System.out.println("Geben Sie bitte die Anzahl der Spalten ein: ");
        int anzahlSpalten = scanner.nextInt();

        // Anlegen 2D-Array
        double[][] array = new double[anzahlZeilen][anzahlSpalten];

        // Array befüllen
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.random() * 100;
            }
        }

        // Ausgabe Array
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ". Zeile: ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Ausgabe Zeilenmaximums
        double[] maxArray = zeilenMaxima(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Maximum der " + (i+1) + ". Zeile:\t" + maxArray[i]);
        }
        scanner.close();
    }
}