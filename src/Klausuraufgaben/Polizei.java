package Klausuraufgaben;

public class Polizei {
    public static double errechneMasse(double volumen, double alkoholvolumenanteil) {

        double result = 0;
        final double DICHTE = 0.8;

        result = volumen * alkoholvolumenanteil * DICHTE;
        return result;
    }

    public static double errechneAlkKonzentration(double alkoholmasse, double gewicht, char typ) {

        if (typ != 'm' && typ != 'w' && typ != 'j') {
            System.out.println("Der Typ der Person ist nicht korrekt eingegeben worden!");
            return -100.0;
        }

        if (typ == 'm') {
            return alkoholmasse / (gewicht * 0.7);
        }
        else if (typ == 'w') {
            return alkoholmasse / (gewicht * 0.6);
        }
        else {
            return alkoholmasse / (gewicht * 0.5);
        }
    }

    public static void main(String[] args) {

        double resultMasse = errechneMasse(1000.0, 0.05);
        System.out.println("Die Alkoholmasse von 5% Bier beträgt " + resultMasse + " Gramm");

        double resultAlkoholKonzentration = errechneAlkKonzentration(resultMasse, 70.0, 'm'); // Ergebnis aus vorherigen Methode!
        System.out.println("Die Alkoholkonzentration einer männlichen Person: " + resultAlkoholKonzentration + " Promille");


        if (resultAlkoholKonzentration >= 0.5) {
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");
        }
        if (resultAlkoholKonzentration >= 0.3 && resultAlkoholKonzentration < 0.5) {
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
    }
}