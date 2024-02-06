package Lek7;
import java.util.Scanner;

public class SinusBerechnung {
    public static double cos(double x) {

        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = 1;

        for (int i = 3; summand > 1E-15 || summand < -1E-15; i += 2) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i-1);
            summand = zaehler / nenner;
            summe += summand;
        }
        return summe;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie eine reelle Zahl (in RAD) ein: ");
        double rad = scan.nextDouble();

        double result = cos(rad);
        System.out.println("Der Sinus von " + rad + " rad = " + result);

        scan.close();
    }
}