package Lek11.ArraysExceptions;

public class TryCatchBeispiel {
    public static void main(String[] args) {

        try {
            int ergebnis = divide(10, 0);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            // Hier wird die Ausnahme behandelt
            System.out.println("Fehler: " + e.getMessage()); // "/ by zero"
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}