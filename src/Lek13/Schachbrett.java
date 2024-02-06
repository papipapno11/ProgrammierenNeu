package Lek13;

public class Schachbrett {

    boolean[][] brett = new boolean[8][8]; // markiert alle bedrohten Felder; 8x8

    public void setzeTurm(int x, int y) {

        // Zeilen
        for (int i = 0; i < 8; i++) {
            brett[x][i] = true; // x = 3
        }

        // Spalten
        for (int i = 0; i < 8; i++) {
            brett[i][y] = true; // y = 5
        }
    }

    @Override // überschreibt gleichnamige Methode in übergeordneten Klasse (hier: Object)
    public String toString() { // gibt textuelle Darstellung zurück

        String str = ""; // leerer String, der als Ergebnis aufgebaut wird
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (brett[i][j]) { // dasselbe wie if(brett[i][j] == true)
                    str = str + "x ";
                }
                else {
                    str = str + "o ";
                }
            }
            str = str + "\n";
        }

        return str; // endgültiges Ergebnis
    }


    public static void main(String[] args) {

        Schachbrett s = new Schachbrett();
        s.setzeTurm(3, 5);
        System.out.println("Ausgabe der bedrohten Felder:");
        System.out.println(s);
    }
}