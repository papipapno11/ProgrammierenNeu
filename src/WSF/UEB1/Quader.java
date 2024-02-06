package WSF.UEB1;
import java.util.Scanner;

public class Quader {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Quaders (in cm) ein: ");
        double laenge = scan.nextDouble();
        System.out.println("Geben Sie die Breite des Quaders (in cm) ein: ");
        double breite = scan.nextDouble();
        System.out.println("Geben Sie die Höhe des Quaders (in cm) ein: ");
        double hoehe = scan.nextDouble();


        double summeKantenlaengen = 4 * (laenge + breite + hoehe);
        System.out.println("Kantensumme: " + summeKantenlaengen + " cm");

        double oberflaeche = 2 * (laenge * hoehe + breite * hoehe + laenge * breite);
        System.out.println("Oberfläche: " + oberflaeche + " cm^2");

        double volumen = (Math.pow(laenge, 2) + Math.pow(breite, 2) + Math.pow(hoehe, 2));
        System.out.println("Volumen: " + volumen + " cm^3");

        scan.close();
    }
}