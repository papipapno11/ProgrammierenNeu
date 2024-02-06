package Lek11.Landschaft;

public class Landscape {

    private String[][] colorMatrix;

    public Landscape(String[][] colorMatrix) {
        this.colorMatrix = colorMatrix;
    }

    public Point findColor(String farbe) {

        for (int i = 0; i < colorMatrix.length; i++) {
            for (int j = 0; j < colorMatrix[i].length; j++) {
                if (colorMatrix[i][j] == farbe) {
                    return new Point(i, j);
                }
            }
        }

        return new Point(-1, -1); // Punkt mit 00 zurückgeben
    }
}