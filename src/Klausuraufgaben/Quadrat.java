package Klausuraufgaben;

public class Quadrat {
    public static void druckeQuadrat(int zeilen) {

        // z.B. int zeilen = 4 -> 4x4 Matrix
        for (int i = 0; i < zeilen; i++) { // Zeilen
            for (int j = 0; j < zeilen; j++) { // Spalten
                if (i == 0 || i == zeilen - 1) {
                    System.out.print("o");
                }
                else {
                    if (j == 0 || j == zeilen - 1) {
                        System.out.print("o");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        druckeQuadrat(5);
    }
}