package Lek7;

public class Lottoziehung {
    public static void ziehung() {

        int [] zahlenArray = new int [6];
        int index = 0;

        while (index < 6) {
            int zufallszahl = (int) (Math.random() * 49 + 1);

            if (!schonVergeben(zahlenArray, zufallszahl)) {
                zahlenArray[index] = zufallszahl;
                index++;
            }
        }

        zahlenArray = sortieren(zahlenArray);
        ausgabeZahlen(zahlenArray);
    }

    public static boolean schonVergeben (int[] zahlenArray, int zufallszahl) {

        for (int i = 0; i < zahlenArray.length; i++) { // Schleife läuft durch alle Elemente durch, um Duplikate zu prüfen
            if (zahlenArray[i] == zufallszahl) {
                return true;
            }
        }
        return false;
    }

    public static int[] sortieren(int[] zahlenArray) {

        // Bubble sort, kein Insertion Sort
        int n = zahlenArray.length; // Länge des Arrays: 6
        for (int i = 0; i < n; i++) { // 6 Durchläufe; "n-1" (5 Durchläufe) auch möglich
            for (int j = 0; j < n - i - 1; j++) {
                if (zahlenArray[j] > zahlenArray[j + 1]) { // 48 > 22
                    int temp = zahlenArray[j]; // 48
                    zahlenArray[j] = zahlenArray[j + 1]; // 1. Stelle ist nun "22"
                    zahlenArray[j + 1] = temp; // 2. Stelle ist nun "48"
                }
            }
        }
        return zahlenArray;
    }

    public static void ausgabeZahlen (int[] zahlenArray) {

        for (int i = 0; i < zahlenArray.length; i++) {
            System.out.println((i + 1) + ". Zahl: " + zahlenArray[i]);
        }
    }

    public static void main(String[] args) {

        ziehung();
    }
}