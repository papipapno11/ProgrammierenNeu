package Lek10.Produktionszaehler;

public class LieblingsautoStatic {
    public static void main(String[] args) {

        AutoStatic[] cars = new AutoStatic[5];
        cars[0] = new AutoStatic("Mercedes", "C63 AMG", "weiss", 6300, 630, 120000, 2020);
        cars[1] = new AutoStatic("BMW", "M3", "schwarz", 5700, 570, 80000, 2019);
        cars[2] = new AutoStatic("Audi", "RS 6", "grau", 6200, 720, 110000, 2021);
        cars[3] = new AutoStatic("Fiat", "Punto", "gelb", 0, 75, 1500, 2010);
        cars[4] = new AutoStatic("Mitsubishi", "Lancer evo", "blau", 5400, 520, 20000, 2017);


        System.out.println("Auto 1: " + cars[0].getHubraum());
        System.out.println("Auto 2: " + cars[1].getHubraum());
        System.out.println("Auto 3: " + cars[2].getHubraum());
        System.out.println("Auto 4: " + cars[3].getHubraum());
        System.out.println("Auto 5: " + cars[4].getHubraum());


        cars[0].setHubraum(0);
        cars[1].setHubraum(10);
        cars[2].setHubraum(-10);


        System.out.println("Auto 1 Hubraum auf 0 setzen: " + cars[0].getHubraum());
        System.out.println("Auto 2 Hubraum auf 10 setzen: " + cars[1].getHubraum());
        System.out.println("Auto 3 Hubraum auf -10 setzen: " + cars[2].getHubraum());


        System.out.println("Es gibt insgesamt " + AutoStatic.getAnzAuto() + " Autos!");
    }
}