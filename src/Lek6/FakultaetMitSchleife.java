package Lek6;
import java.util.Scanner;

public class FakultaetMitSchleife {

    public static int fakultaet (int zahl) {

        int ergebnis = 1;
        for (int i = 1; i <= zahl; i++) {
            ergebnis *= i;
        }
        return ergebnis;

        /*
        if (num <= 1) {
		return 1;
		} else
		{
		return fakultaet(num - 1) * num;
		}
         */
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine positive ganze Zahl ein: ");
        int eingabe = scan.nextInt();

        int ergebnis = fakultaet(eingabe);
        System.out.println("Fakultät von " + eingabe + " lautet: " + ergebnis);

        scan.close();
    }
}