package Weiteres;

public class InsertionSort {
    public static void insertionSort(int [] zahlenArray) {

        for (int i = 1; i < zahlenArray.length; i++) { // wir beginnen bei index 1
            int temp = zahlenArray[i]; // fügen diese in einem "temporary storage"
            int j = i - 1; // Zugriff auf linkes Element von temp

            while (j >= 0 && zahlenArray[j] > temp) { // prüfen, ob die Elemente auf der linken Seiten von temp größer sind
                zahlenArray[j+1] = zahlenArray[j]; // Element nach rechts schieben
                j--;
            }
            zahlenArray[j + 1] = temp;
        }

        for (int k = 0; k < zahlenArray.length; k++) {
            System.out.print(zahlenArray[k] + " ");
        }
    }

    public static void main(String[] args) {

        int[] zahlenArray = {9, 3, 5, 7, 1, 4, 2, 8, 6};
        insertionSort(zahlenArray);
    }
}