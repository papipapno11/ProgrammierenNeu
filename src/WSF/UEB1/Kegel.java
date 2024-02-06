package WSF.UEB1;
import java.util.Scanner;

public class Kegel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den Radius r des Kegels ein: ");
        double radius = scan.nextDouble();
        System.out.println("Geben Sie die Höhe h des Kegels ein: ");
        double hoehe = scan.nextDouble();


        double seitenlinie = Math.sqrt(Math.pow(hoehe, 2) + Math.pow(radius, 2));
        System.out.println("Seitenlinie s: " + seitenlinie);

        double oberflaeche = Math.PI * Math.pow(radius, 2) + Math.PI * radius * seitenlinie;
        System.out.println("Oberfläche: " + oberflaeche);

        double volumen = (1.0 / 3.0) * Math.PI + Math.pow(radius, 2) * hoehe;
        System.out.println("Volumen: " + volumen);

        scan.close();
    }
}