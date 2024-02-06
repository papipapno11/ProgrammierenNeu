package Klausuraufgaben;

public class Bruttopreis {

    public static double berechneNetto(double brutto, double mehrwertsteuer) {

        double result = 0.0;
        result = brutto / (mehrwertsteuer + 1);

        return result;
    }

    public static void main(String[] args) {

        double result = berechneNetto(5.35, 0.07);
        System.out.println("Nettopreis: " + result + "€");
    }
}