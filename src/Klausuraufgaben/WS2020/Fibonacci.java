package Klausuraufgaben.WS2020;

public class Fibonacci {
    public static int fibs(int n) {

        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        else {
            return fibs(n - 1) + fibs(n - 2);
        }
    }

    public static void main(String[] args) {

        int n = 10;
        int ergebnis = fibs(n);
        System.out.println("Summe der Fibonacci-Folge:");
        System.out.println(ergebnis + "\n");

        System.out.println("Fibonacci-Folge:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibs(i) + " ");
        }
    }
}