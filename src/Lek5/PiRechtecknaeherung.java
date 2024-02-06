package Lek5;
import java.util.Scanner;

public class PiRechtecknaeherung {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie bitte die Anzahl der zu verwendenden Rechtecke ein: ");
        double anzahl = scan.nextDouble();

        double pi = 1.0 / anzahl;
        double x = 1.0;
        int counter = 1;

        while(counter < anzahl) {
            pi = pi + x / anzahl * Math.sqrt(((x * x) - ((counter / anzahl) * counter / anzahl)));
            counter++;
        }
        System.out.println("Berechnung von Pi mit " + anzahl + " Rechtecken: " + (4 * pi));

        scan.close();
    }
}