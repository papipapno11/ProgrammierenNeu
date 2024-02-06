package Lek7.zusatz;
import java.util.Scanner;

public class Eratosthenes {
    public static int [] fillArray (int n) {

        int [] array = new int [n + 1]; // n = 20; um Zahlen von 0 bis 20 zu bekommen

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void sieve (int[] array) {

        array[0] = -1;
        array[1] = -1;

        int limit = (int) Math.sqrt(array.length);

        for (int i = 2; i <= limit; i++) { // Durchläufe
            if (array[i] != -1) {
                for (int j = i * i; j < array.length; j += i) {
                    array[j] = -1;
                }
            }
        }
    }

    public static void showContent(int [] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                System.out.println(i + " is not a prime number.");
            }
            else {
                System.out.println(i + " is a prime number.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine gewünschte Obergrenze ein: ");
        int n = scan.nextInt(); // z.B. n = 20

        int [] zahlen = fillArray(n);
        sieve(zahlen);
        showContent(zahlen);

        scan.close();
    }
}