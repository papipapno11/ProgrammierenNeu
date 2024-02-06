package Lek4;
import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Falldauer in Sekunden eingeben: ");
        int t = scan.nextInt();

        double g = 9.80665;

        for (int i = 1; i <= t; i++) {
            double s = 0.5 * g * Math.pow(i, 2);
            if (i == 1 || (i % 5 == 1)) {
                System.out.println("Zeit: " + i + " Sekunden; Zurückgelegte Strecke: " + s + " m");
                Thread.sleep(1000);
            }
        }
        scan.close();
    }
}