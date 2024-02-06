package Lek5.zusatz;
import java.util.Scanner;

public class Summieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte ganze Zahlen ein: ");
        int eingabe = scan.nextInt();

        int summe = 0;

        while (eingabe != 0) {
            summe += eingabe;
            eingabe = scan.nextInt();

            if (eingabe == 0) {
                break;
            }
        }
        System.out.println("Summe: " + summe);
        scan.close();
    }
}