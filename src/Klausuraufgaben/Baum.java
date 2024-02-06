package Klausuraufgaben;
import java.util.Scanner;

public class Baum {

    private int aeste;
    private final String typ; // nicht modifizierbar sein

    // Konstruktor
    public Baum(int aeste, String typ) {
        this.aeste = aeste;
        if (typ.equals("Eiche") || typ.equals("Birke")) {
            this.typ = typ;
        }
        else {
            this.typ = "Anderer";
        }
    }

    // Getter-Methoden
    public int getAeste() {
        return aeste;
    }
    public String getTyp() {
        return typ;
    }

    // Setter-Methoden, jedoch "typ" nicht möglich (final)
    public void setAeste(int aeste) {
        this.aeste = aeste;
    }

    public String toString() {
        return typ + " mit " + aeste + " Hauptästen";
    }

    public static void main(String[] args) {

        Baum[] wald = new Baum[600]; // Wald mit 600 Bäumen

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < wald.length; i++) {
            System.out.println("Anzahl der Hauptäste von Baum " + (i + 1) + ":");
            int anzahlAeste = scan.nextInt();
            scan = new Scanner(System.in); // nur relevant für die IDE, nicht Klausur
            System.out.println("Typ von Baum " + (i + 1) + ":");
            String typ = scan.nextLine();

            wald[i] = new Baum(anzahlAeste, typ);
        }

        for (int i = 0; i < wald.length; i++) {
            System.out.println(wald[i]); // um toString() Methode zu testen
        }
    }
}