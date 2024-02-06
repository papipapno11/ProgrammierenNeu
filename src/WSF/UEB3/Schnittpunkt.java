package WSF.UEB3;
import java.util.Scanner;

public class Schnittpunkt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die Koeffizienten der Geraden g(x) ein: ");
        System.out.println("a: ");
        double a_g = scan.nextDouble();
        System.out.println("b: ");
        double b_g = scan.nextDouble();

        System.out.println("Geben Sie die Koeffizienten der Geraden h(x) ein: ");
        System.out.println("c: ");
        double c_h = scan.nextDouble();
        System.out.println("d: ");
        double d_h = scan.nextDouble();

        if (a_g == c_h && b_g == d_h) {
            System.out.println("Die Geraden g(x) und h (x) fallen zusammen und sind identisch!");
        }

        else if (a_g == c_h) {
            System.out.println("Die Geraden g(x) und h (x) sind echt parallel und haben keinen Schnittpunkt!");
        }

        else {
            double schnittpunktX = (b_g - d_h) / (a_g - c_h);
            double schnittpunktY = a_g * schnittpunktX + b_g;
            System.out.println("Die Geraden g(x) und h(x) schneiden sich im Punkt P(" + schnittpunktX + "/" + schnittpunktY + ").");
        }

        scan.close();
    }
}