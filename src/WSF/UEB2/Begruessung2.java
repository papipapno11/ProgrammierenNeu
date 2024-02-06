package WSF.UEB2;
import java.util.Scanner;

public class Begruessung2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihr Alter ein: ");
        int alter = scan.nextInt();
        scan.nextLine(); // Zeilenumbruch absorbieren
        System.out.println("Geben Sie bitte Ihr Namen ein: ");
        String name = scan.nextLine();
        System.out.println("Geben Sie bitte Ihr Geschlecht (m/w) ein: ");
        char geschlecht = scan.nextLine().charAt(0);

        if (alter >= 18) {
            if (geschlecht == 'm') {
                System.out.println("Guten Tag Herr " + name + "!");
            }
            else if (geschlecht == 'w') {
                System.out.println("Guten Tag Frau " + name + "!");
            }
        }
        else {
            System.out.println("Hallo " + name + "!");
        }
        scan.close();
    }
}