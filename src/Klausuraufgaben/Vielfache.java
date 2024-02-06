package Klausuraufgaben;

public class Vielfache {
    public static int vielfacheVonSieben(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0 && arr[i] != 0) { // 0 ist kein Vielfaches von 7
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] zahlen = {52, 70, -7, 36, 7, 23, 0, 13, 28, 21, 65, 35};

        int result = vielfacheVonSieben(zahlen);
        System.out.println(result);
    }
}