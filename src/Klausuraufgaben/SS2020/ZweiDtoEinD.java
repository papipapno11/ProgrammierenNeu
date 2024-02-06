package Klausuraufgaben.SS2020;

public class ZweiDtoEinD {
    public static int[] flattern(int[][] arr) {

        // Länge von 2D-Array bestimmen
        int laenge = 0;
        for (int i = 0; i < arr.length; i++) {
            laenge += arr[i].length;
        }

        // 2D in 1D-Array umwandeln
        int[] neueArray = new int[laenge];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                neueArray[k] = arr[i][j];
                k++;
            }
        }

        return neueArray;
    }

    public static void main(String[] args) {

        int[][] zweidimensionalesArray = {
                {1, 2, 3, 4, 5},
                {6},
                {7, 8},
                {9, 10, 11, 12}
        };

        int[] result = flattern(zweidimensionalesArray);

        // Ausgabe
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}