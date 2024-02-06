package Klausuraufgaben;
import java.util.Scanner;

public class SpaceInvaders {

    private char[][] feld;
    private int position;

    public SpaceInvaders() {
        // Konstruktor wird automatisch aufgerufen, wenn Objekt erzeugt wird
        // Spielbrett wird beim Start des Spiels vorbereitet

        feld = new char[5][8];

        // erste Zeile Aliens
        for (int i = 0; i < 8; i++) {
            feld[0][i] = 'o';
        }

        // zweite bis vierte Zeile Leerzeichen
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 8; j++) {
                feld[i][j] = ' ';
            }
        }

        // fünfte Zeile Raumschiff
        position = (int) (Math.random() * 8); // 0 bis 7
        feld[4][position] = 'U';
    }

    public void move(char b) {

        if (b == 'j') {
            feld[4][position] = ' '; // gesamte Zeile wird gelöscht
            if (position > 0) {
                position--;
            }
            feld[4][position] = 'U';
        }
        else if (b == 'l') {
            feld[4][position] = ' ';
            if (position < 7) {
                position++;
            }
            feld[4][position] = 'U';
        }
    }

    public String toString() {

        String ergebnis = "";

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                ergebnis += feld[i][j];
            }
            ergebnis += "\n";
        }

        return ergebnis;
    }

    public static void main(String[] args) {

        SpaceInvaders spiel = new SpaceInvaders(); // Objekt erzeugt

        Scanner scan = new Scanner(System.in);

        while (true) {
            char eingabe = scan.nextLine().charAt(0);

            spiel.move(eingabe);
            System.out.println(spiel);

            if (eingabe == 'y') {
                break;
            }
        }
    }
}