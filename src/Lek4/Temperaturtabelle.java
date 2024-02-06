package Lek4;

public class Temperaturtabelle {
    public static void main(String[] args) {

        int fahrenheit = 0;

        System.out.println("Fahrenheit\tCelsius");

        for (fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
            double grad = (5.0/9.0) * (fahrenheit - 32);
            System.out.printf(fahrenheit + "\t\t\t" + "%.2f\n", grad);
        }
    }
}