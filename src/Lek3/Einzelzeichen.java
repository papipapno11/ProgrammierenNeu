package Lek3;
import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Geben Sie ein Einzelzeichen ein: ");
        char eingabe = scan.nextLine().charAt(0);

        if (eingabe >= 'A' && eingabe <= 'Z') {
            System.out.println("Großbuchstabe");
        }
        if (eingabe >= '0' && eingabe <= '9' || eingabe >= 'a' && eingabe <= 'f' || eingabe >= 'A' && eingabe <= 'F') {
            System.out.println("Hexadezimale Ziffer");
        }
        if (eingabe == '0' || eingabe == '1') {
            System.out.println("binäre Ziffer");
        }
        if (eingabe >= '0' && eingabe <= '7') {
            System.out.println("oktale Ziffer");
        }
        if (!(eingabe >= '0' && eingabe <= '9' || eingabe >= 'a' && eingabe <= 'f' || eingabe >= 'A' && eingabe <= 'Z')){
            System.out.println("Unbekannt");
        }
        scan.close();
    }
}