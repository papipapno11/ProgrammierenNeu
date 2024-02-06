package Lek5.skript;

import java.util.Scanner;
public class Ratespiel {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int eingabe = scan.nextInt();

        int zufallszahl = (int) (Math.random() * 100 + 1); // Zufallszahlen von 0 bis 100

        boolean getroffen = false;
        int counter = 0; // Zählvariable

        while (!getroffen && counter < 10) { // !getroffen = true
            if (eingabe == zufallszahl) {
                getroffen = true;
                System.out.println("Treffer!");
                scan.close();
            }
            if (eingabe > zufallszahl) {
                System.out.println("Die Zufallszahl ist kleiner!");
                eingabe = scan.nextInt();
            }
            if (eingabe < zufallszahl) {
                System.out.println("Die Zufallszahl ist größer!");
                eingabe = scan.nextInt();
            }
            counter++;
        }
        if (getroffen) {
            System.out.println("Sie haben gewonnen!");
        }
        else {
            System.out.println("Sie haben verloren!");
        }
    }
}