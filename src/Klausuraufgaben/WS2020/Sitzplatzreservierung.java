package Klausuraufgaben.WS2020;

public class Sitzplatzreservierung {

    public static char[][] erstelleSaal(int anzahlReihen) {

        char[][] arr = new char[anzahlReihen][]; // Zeilen x Spalten

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new char[i + 3]; // in jeder Zeile wird die Spaltenlänge definiert
        }

        return arr;
    }

    public static void fuelleSitze(char[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int random = (int) (Math.random() * 2 + 1); // Ausgabe: 1 oder 2
                if (random == 1) {
                    arr[i][j] = 'o';
                }
                else {
                    arr[i][j] = 'x';
                }
            }
        }
    }

    public static void bucheSitz(char[][] arr, int reihe, int spalte) {

        if (arr[reihe][spalte] == 'x') {
            System.out.println("Platz nicht frei");
            return;
        }
        else {
            System.out.println("Platz ist frei. Sie können Ihn buchen!");
        }
    }

    public static void darstellung(char[][] arr) {

        // stimmt nicht ganz
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] saal = erstelleSaal(5);
        fuelleSitze(saal);
        bucheSitz(saal, 3, 2);
        darstellung(saal);
    }
}