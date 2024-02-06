package Lek11.ArraysExceptions;

public class ZweidimensionalesArrayBeispiel {
    public static void main(String[] args) {

        // Deklaration und Initialisierung eines 2D-Arrays
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10} };

        // Ausgabe des ursprünglichen Arrays
        System.out.println("Ursprüngliches 2D-Array:");
        ausgabeArray(matrix);

        // Operation: Summe der Elemente berechnen
        int summe = berechneSumme(matrix);
        System.out.println("Summe der Elemente: " + summe);

        // Operation: Das größte Element finden
        int max = findeMaxElement(matrix);
        System.out.println("Größtes Element: " + max);

        // Operation: Transponieren des Arrays
        int[][] transponierteMatrix = transposeMatrix(matrix);
        System.out.println("Transponiertes 2D-Array:");
        ausgabeArray(transponierteMatrix);

        // Operation: Länge der Spalten
        int[] laengeZeile = laengeZeilen(matrix);

        for (int k = 0; k < matrix.length; k++) {
            int laengeDerZeile = laengeZeile.length;
            System.out.println("Länge der " + (k+1) + ". Zeile: " + laengeZeile[k]);
        }
    }

    // Methode zur Ausgabe eines 2D-Arrays
    public static void ausgabeArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Neue Zeile nach jeder Reihe
        }
        System.out.println(); // Leerzeile am Ende
    }

    // Methode zur Berechnung der Summe aller Elemente in einem 2D-Array
    public static int berechneSumme(int[][] array) {

        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summe += array[i][j];
            }
        }

        return summe;
    }

    // Methode zur Suche des größten Elements in einem 2D-Array
    public static int findeMaxElement(int[][] array) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    // Methode zum Transponieren eines 2D-Arrays
    public static int[][] transposeMatrix(int[][] array) {

        int zeilen = array.length;
        int spalten = array[0].length;
        int[][] transponiert = new int[spalten][zeilen];

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                transponiert[j][i] = array[i][j];
            }
        }

        return transponiert;
    }

    public static int[] laengeZeilen(int[][] array) {

        int[] laengeDerZeile = new int[array.length];

        for(int k = 0; k < array.length; k++) {
            laengeDerZeile[k] = array[k].length;
        }

        return laengeDerZeile;
    }
}