package Lek11.ArraysExceptions;

public class Test2D {
    public static void main(String[] args) {

        float[][] matrix = new float[2][3];
        matrix[0][0] = 1.1f;
        matrix[0][1] = 1.2f;
        matrix[0][2] = 1.3f;
        matrix[1][0] = 2.1f;
        matrix[1][1] = 2.2f;
        matrix[1][2] = 2.3f;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}