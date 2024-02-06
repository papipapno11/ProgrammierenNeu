package Klausuraufgaben;

public class Polynom {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;

    public Polynom(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public String toString() {
        // Plus-Operator im String nicht vergessen
        return a + "x^4 + " + b + "x^3 + " + c + "x^2 + " + d + "x + " + e;
    }

    public Polynom ableiten() {
        // wichtig: a muss 0 sein, da Grad 4 wegfällt beim Ableiten
        return new Polynom(0, 4 * a, 3 * b, 2 * c, 1 * d);
    }

    public static void main(String[] args) {

        Polynom p = new Polynom(3, 4, 5, 4, 6);
        Polynom p2 = new Polynom(4, 5, 3, 6, 0);

        System.out.println("Polynom von Grad 4: " + p);
        System.out.println("Ableitung des Polynoms von Grad 4: " + p.ableiten());
    }
}