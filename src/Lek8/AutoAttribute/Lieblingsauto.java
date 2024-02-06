package Lek8.AutoAttribute;

public class Lieblingsauto {
    public static void main(String[] args) {

        // Erstellung eines Objekts der Klasse "Auto"
        Auto [] cars = new Auto[3];

        // drei Auto-Objekte mit unterschiedlichen Eigenschaften werden instanziiert und in das Array eingefügt
        cars[0] = new Auto("Mercedes", "S63S", 5400, "schwarz", 700, 150000.0);
        cars[1] = new Auto("Audi", "RS7", 5700, "grün", 740, 170000.0);
        cars[2] = new Auto("BMW", "M4", 3600, "weiß", 680, 120000.0);

        if (cars.length > 0) {
            int maxHubraum = cars[0].hubraum;
            int max = 0;

            for (int i = 0; i < cars.length; i++) {
                int aktHubraum = cars[i].hubraum;

                if (aktHubraum > maxHubraum) {
                    maxHubraum = aktHubraum;
                    max = i;
                }
            }

            System.out.println("Das Auto mit dem größten Hubraum: ");
            System.out.println("Marke: " + cars[max].marke);
            System.out.println("Modell: " + cars[max].modell);
            System.out.println("Hubraum: " + cars[max].hubraum);
            System.out.println("Farbe: " + cars[max].farbe);
            System.out.println("Leistung (in PS): " + cars[max].leistungInPS);
            System.out.println("Preis: " + cars[max].preis);
        }
        else {
            System.out.println("Keine Autos vorhanden.");
        }
    }
}