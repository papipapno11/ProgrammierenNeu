package Lek13;

public class Punkt {

    double x;
    double y;
    double z;

    public Punkt(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double berechneAbstand() {

        double ergebnis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return ergebnis;
    }

    @Override
    public String toString() {

        return "a=" + x + ", b=" + y + ", c=" + z;
    }


    public static void main(String[] args) {

        Punkt eins = new Punkt(2, 5, 7);
        Punkt zwei = new Punkt(2, 5, -3);
        Punkt drei = new Punkt(3, 9, 3);

        System.out.println("Ausgabe der Punkte:");
        System.out.println("Punkt 1: " + eins); // eins.toString() nicht nötig
        System.out.println("Punkt 2: " + zwei);
        System.out.println("Punkt 3: " + drei);

        System.out.println("\nAusgabe des Abstands zum Ursprung:");
        System.out.println("Punkt 1: " + eins.berechneAbstand());
        System.out.println("Punkt 2: " + zwei.berechneAbstand());
        System.out.println("Punkt 3: " + drei.berechneAbstand());
    }
}