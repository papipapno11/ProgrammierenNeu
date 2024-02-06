package Lek3;
import java.util.Scanner;

public class Pizzarechner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den Durchmesser der ersten Pizza ein: ");
        int durchmesser1 = scan.nextInt();
        System.out.println("Geben Sie den Preis der ersten Pizza ein: ");
        int preis1 = scan.nextInt();
        System.out.println("Geben Sie den Durchmesser der zweiten Pizza ein: ");
        int durchmesser2 = scan.nextInt();
        System.out.println("Geben Sie den Preis der zweiten Pizza ein: ");
        int preis2 = scan.nextInt();

        double r1 = durchmesser1 / 2.0;
        double r2 = durchmesser2 / 2.0;

        double flaecheninhalt1 = Math.pow(r1, 2) * Math.PI;
        double flaecheninhalt2 = Math.pow(r2, 2) * Math.PI;

        if ((preis1 / flaecheninhalt1) > (preis2 / flaecheninhalt2)) {
            System.out.println("Die erste Pizza hat das bessere Größen-/ Preisverhältnis.");
        }
        else {
            System.out.println("Die zweite Pizza hat das bessere Größen-/ Preisverhältnis.");
        }
        scan.close();
    }
}