package WSF.UEB3;
import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die zu überprüfende Jahreszahl ein: ");
        int jahreszahl = scan.nextInt();

        if (jahreszahl % 4 == 0) {
            if (jahreszahl % 100 == 0) {
                if (jahreszahl % 400 == 0) {
                    System.out.println(jahreszahl + " ist ein Schaltjahr!");
                }
                else {
                    System.out.println(jahreszahl + " ist kein Schaltjahr!");
                }
            }
            else {
                System.out.println(jahreszahl + " ist ein Schaltjahr!");
            }
        }
        else {
            System.out.println(jahreszahl + " ist kein Schaltjahr!");
        }
        scan.close();
    }
}