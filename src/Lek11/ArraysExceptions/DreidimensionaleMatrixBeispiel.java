package Lek11.ArraysExceptions;

public class DreidimensionaleMatrixBeispiel {
    public static void main(String[] args) {

        // Deklaration und Initialisierung eines 3D-Arrays (3x3x3)
        int[][][] dreidimensionalesArray = {
                { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
                { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
                { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };

        // Zugriff auf Elemente des 3D-Arrays
        int element = dreidimensionalesArray[1][2][0];
        System.out.println("Element an Position [1][2][0]: " + element);

        // Iteration durch das 3D-Array und Ausgabe der Elemente
        for (int i = 0; i < dreidimensionalesArray.length; i++) {
            for (int j = 0; j < dreidimensionalesArray[i].length; j++) {
                for (int k = 0; k < dreidimensionalesArray[i][j].length; k++) {
                    int wert = dreidimensionalesArray[i][j][k];
                    System.out.println("Element an Position [" + i + "][" + j + "][" + k + "]: " + wert);
                }
            }
        }
    }
}