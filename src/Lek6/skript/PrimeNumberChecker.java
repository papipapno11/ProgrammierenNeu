package Lek6.skript;

import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine positive ganze Zahl ein: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " ist eine Primzahl.");
        } else {
            System.out.println(number + " ist keine Primzahl.");
        }
    }

    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        // Überprüfen, ob die Zahl durch 2 oder durch ungerade Zahlen bis zur Wurzel überhaupt teilbar ist
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}