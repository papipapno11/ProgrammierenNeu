package WSF.UEB3;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte drei Zahlen ein: ");
        double zahl1 = scan.nextDouble();
        double zahl2 = scan.nextDouble();
        double zahl3 = scan.nextDouble();

        double max = zahl1;
        double mid = zahl2;
        double min = zahl3;

        // ersten beide ifs: Überprüfung von max
        if (zahl2 > max) {
            max = zahl2;
            mid = zahl1;
        }

        if (zahl3 > max) {
            max = zahl3;
            mid = zahl1;
            min = zahl2;
        }

        // letzten beide ifs: Überprüfung von min
        if (zahl2 < min) {
            min = zahl2;
            mid = zahl1;
        }

        if (zahl1 < min) {
            min = zahl1;
            mid = zahl2;
        }

        System.out.println("Größte Zahl: " + max);
        System.out.println("Mittel größte Zahl: " + mid);
        System.out.println("Kleinste Zahl: " + min);

        scan.close();
    }
}