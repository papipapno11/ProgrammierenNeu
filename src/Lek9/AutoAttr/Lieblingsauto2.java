package Lek9.AutoAttr;

public class Lieblingsauto2 { // hier wird die Funktionalität demonstrieren
    public static void main(String[] args) {

        // Erstellung eines Objekts der Klasse "Auto2"
        Auto2[] cars = new Auto2[3]; // "this" refers to the cars-object

        // drei Auto-Objekte mit unterschiedlichen Eigenschaften werden instanziiert und in das Array eingefügt
        cars[0] = new Auto2("Mercedes", "S63S", 5400, "schwarz", 700, 150000.0);
        cars[1] = new Auto2("Audi", "RS7", 5700, "grün", 740, 170000.0);
        cars[2] = new Auto2("BMW", "M4", 3600, "weiß", 680, 120000.0);

        // Überprüfung getHubraum
        System.out.println("Auto 1 vorher: " + cars[0].getHubraum());
        System.out.println("Auto 2 vorher: " + cars[1].getHubraum());
        System.out.println("Auto 3 vorher: " + cars[2].getHubraum());

        // Hubraum der Autos mit setHubraum ändern/ setzen
        cars[0].setHubraum(0);
        cars[1].setHubraum(10); // x > 0 -> hier wird der Hubraum verändert
        cars[2].setHubraum(-20);

        // Überprüfung setHubraum mit erneutem getHubraum; get = Lesezugriff der Instanzvariable
        System.out.println("Auto 1 Hubraum auf 0 setzen: " + cars[0].getHubraum());
        System.out.println("Auto 2 Hubraum auf 10 setzen: " + cars[1].getHubraum());
        System.out.println("Auto 3 Hubraum auf -20 setzen: " + cars[2].getHubraum());
    }
}