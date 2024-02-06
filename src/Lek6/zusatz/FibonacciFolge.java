package Lek6.zusatz;
import java.util.Scanner;

public class FibonacciFolge {

    public static int fibonacci (int n) {

        if (n == 0) {
            return n;
        }
        else if (n == 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine natürliche Zahl für die Fibonacci-Folge ein: ");
        int n = scan.nextInt();

        System.out.println("Fibonacci-Folge bis zur " + n + ". Zahl:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scan.close();
    }
}