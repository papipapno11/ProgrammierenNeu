package Lek9.Pizza;

public class PizzaObjects {
    public static void main(String[] args) {

        Pizza[] pizza = new Pizza[5];

        // Erstellen von 5 Pizzen mit verschiedenen Durchmesser-Preis-Kombinationen
        pizza[0] = new Pizza("Margherita", 20.0, 11.99);
        pizza[1] = new Pizza("Pepperoni", 23.0,14.99);
        pizza[2] = new Pizza("Vegetarian", 26.0, 12.99);
        pizza[3] = new Pizza("Hawaii", 26.0, 16.99);
        pizza[4] = new Pizza("Calzone", 30.0, 15.99);

        int x = 0;
        for(int i = 1; i <5; i++) {
            if (pizza[i].getPreisProQuadratCM() < pizza[x].getPreisProQuadratCM()) {
                x = i;
                System.out.println(pizza[i].getName());
            }
        }

        System.out.println("Die Pizza mit dem besten Preis/Leistungsverhältnis ist die " + pizza[x].getName() + " Pizza mit einem Verhältnis von: " + pizza[x].getPreisProQuadratCM());
    }
}