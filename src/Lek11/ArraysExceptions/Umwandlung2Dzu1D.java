package Lek11.ArraysExceptions;

public class Umwandlung2Dzu1D {
    public static void main(String[] args) {

        // Beispiel-2D-Array mit unterschiedlichen Zeilenlängen
        int[][] zweidimensionalesArray = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };

        // Umwandlung von 2D zu 1D
        int[] eindimensionalesArray = umwandleZu1D(zweidimensionalesArray);

        // Ausgabe des ursprünglichen 2D-Arrays
        System.out.println("Ursprüngliches 2D-Array:");
        ausgabe2DArray(zweidimensionalesArray);

        // Ausgabe des umgewandelten 1D-Arrays
        System.out.println("Umgewandeltes 1D-Array:");
        ausgabe1DArray(eindimensionalesArray);
    }

    // Methode zur Umwandlung von 2D zu 1D
    public static int[] umwandleZu1D(int[][] array2D) {

        int laenge = 0;

        // Berechne die Gesamtlänge für das 1D-Array
        for (int i = 0; i < array2D.length; i++) {
            laenge += array2D[i].length;
        }

        int[] array1D = new int[laenge];

        int k = 0; // Index 1D Array

        // Kopiere die Elemente von jeder Zeile ins 1D-Array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array1D[k] = array2D[i][j];
                k++;
            }
        }

        return array1D;
    }

    // Hilfsmethode zur Ausgabe eines 2D-Arrays
    public static void ausgabe2DArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Hilfsmethode zur Ausgabe eines 1D-Arrays
    public static void ausgabe1DArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}