package Lek9.Pizza;

public class Pizza {
    private String name;
    private double durchmesser;
    private double preis;

    public Pizza(String name, double durchmesser, double preis) {

        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }
    public double getDurchmesser() {
        return durchmesser;
    }
    public double getPreis() {
        return preis;
    }
    public double getPreisProQuadratCM() {
        return preis / durchmesser;
    }
}
    /*
    public double calculateBestValue() {
        double bestValue = Double.MAX_VALUE;

        for (int i = 0; i < durchmesser.length; i++) {
            double diameter = durchmesser[i];
            double price = preis[i];
            double value = price / diameter;

            if (value < bestValue) {
                bestValue = value;
            }
        }

        return bestValue;
     */