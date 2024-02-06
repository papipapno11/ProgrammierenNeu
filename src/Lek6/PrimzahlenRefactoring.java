package Lek6;
import java.util.Scanner;

public class PrimzahlenRefactoring {

    public static boolean isPrim (int zahl) {

        boolean isPrim = false;

        for (int i = 1; i <= zahl; i++) {
            isPrim = true;
            for (int j = 2; i > j; j++) {
                if (i % j == 0) {
                    isPrim = false;
                    break;
                }
            }
            if (i == 1) {
                isPrim = false;
            }
        }
        return isPrim;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte zu untersuchende Zahl eingeben: ");
        int zahl = scan.nextInt();

        System.out.println(isPrim(zahl));

        scan.close();
    }
}