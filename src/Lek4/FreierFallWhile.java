package Lek4;

import java.util.Scanner;

public class FreierFallWhile {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Falldauer in Sekunden eingeben: ");
        int t = scan.nextInt();

        double g = 9.80665;
        int sek = 1;

        while (sek <= t) {
            double s = 0.5 * g * Math.pow(sek, 2);
            if (sek == 1 || sek % 5 == 1) {
                System.out.println("Zeit: " + sek + " Sekunden; Zurückgelegte Strecke: " + s);
            }
                Thread.sleep(500);
                sek++;
        }
        scan.close();
    }
}