package Klausuraufgaben;

public class BlaSort {

    private int [] arr;

    public BlaSort(int [] arr) {
        this.arr = arr;
    }

    public void mischen() {

        int indexA = (int) (Math.random() * arr.length);
        int indexB = (int) (Math.random() * arr.length);

        while (indexA == indexB) {
            indexB = (int) (Math.random() * arr.length);
        }

        int temp = arr[indexA]; // beim Vertauschen von Elementen brauchen wir eine dritte Variable
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public void ausgabe() { // kein Parameter in Methode nötig, da das Array bereits als Attribut initialisiert wurde

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean aufsteigend() {

        boolean isSorted = true; // gehen davon aus, dass es sortiert ist

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    public int sortieren() {

        int result = 0; // Integer soll zurückgegeben werden

        while (!aufsteigend()) {
            mischen();
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr2 = new int[100];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 1000000) + 1;
        }

        BlaSort instanz = new BlaSort(arr2); // Instanz/ Objekt erzeugen

        int ergebnis = instanz.sortieren(); // wir sollen ausgeben wie oft sortiert wurde
        System.out.println(ergebnis);
    }
}