package Lek5;

import java.util.Scanner;

public class Quadratwurzelberechnung {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte den Radikanden ein: ");
        double x = scan.nextDouble();
        System.out.println("Geben Sie bitte die Anzahl der Durchläufe ein: ");
        int anzahl = scan.nextInt();

        int counter = 1;
        double y = 1.0;

        while(anzahl >= counter) {
            y = (((x / y)  + y) / 2.0);
            if (counter == 10) {
                System.out.println("Nach " + counter + " Durchläufen: " + y + ", Math-Methode: " + Math.sqrt(x));
            }
            if (counter == 100) {
                System.out.println("Nach " + counter + " Durchläufen: " + y + ", Math-Methode: " + Math.sqrt(x));
            }
            if (counter == 1000) {
                System.out.println("Nach " + counter + " Durchläufen: " + y + ", Math-Methode: " + Math.sqrt(x));
            }
            if (counter == 10000) {
                System.out.println("Nach " + counter + " Durchläufen: " + y + ", Math-Methode: " + Math.sqrt(x));
            }
            counter++;
        }
        System.out.println("Die Wurzel aus " + x + " lautet " + y);
        scan.close();
    }
}