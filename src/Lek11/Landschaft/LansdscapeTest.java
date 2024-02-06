package Lek11.Landschaft;

public class LansdscapeTest {
    public static void main(String[] args) {

        String[][] colorMatrix = {
                {"Blue", "Green", "Red"},
                {"Yellow", "IndianRed", "Purple"},
                {"Cyan", "Magenta", "Orange"}
        };

        Landscape firstLandscape = new Landscape(colorMatrix);

        Point ergebnis = firstLandscape.findColor("IndianRed");

        // Tell, don't ask
        if (ergebnis.getX() == -1 && ergebnis.getY() == -1) {
            System.out.println("Farbe nicht gefunden.");
        }
        else {
            System.out.println("Farbe gefunden an Position: (" + ergebnis.getX() + ", " + ergebnis.getY() + ")");
        }
    }
}