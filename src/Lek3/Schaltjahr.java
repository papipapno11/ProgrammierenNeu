package Lek3;
import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie Ihre Jahreszahl ein: ");
        int zahl = scan.nextInt();

        if ((zahl % 4 == 0) && (!(zahl % 100 == 0)) || (zahl % 400 == 0)) {
            System.out.println(zahl + " ist ein Schaltjahr!");
        }
        else {
            System.out.println(zahl + " ist kein Schaltjahr!");
        }
        scan.close();
    }
}