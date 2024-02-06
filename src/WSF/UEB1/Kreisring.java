package WSF.UEB1;
import java.util.Scanner;

public class Kreisring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den inneren Radius des Kreisrings ein: ");
        double radiusInnen = scan.nextDouble();
        System.out.println("Geben Sie den äußeren Radius des Kreisrings ein: ");
        double radiusAussen = scan.nextDouble();


        double flaecheninhaltInnen = Math.PI * Math.pow(radiusInnen, 2);
        double flaecheninhaltAussen = Math.PI * Math.pow(radiusAussen, 2);

        double flaecheninhaltKreisring = flaecheninhaltAussen - flaecheninhaltInnen;
        System.out.println("Flächeninhalt Kreisring: " + flaecheninhaltKreisring);

        scan.close();
    }
}