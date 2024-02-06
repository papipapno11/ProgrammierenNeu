package Klausuraufgaben.Navigationssystem;

public class Route {

    private Ankunftsort head;

    public Route() { // leere Liste erzeugen
        this.head = null;
    }

    public void hinzufuegen(Ankunftsort neuesElement) { // am Ende

        if (head == null) {
            head = neuesElement;
        }
        else {
            Ankunftsort current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(neuesElement);
        }
    }

    public int gesamtStrecke() {

        int anzahlKilometer = 0;

        Ankunftsort current = head;
        while (current.getNext() != null) {
            anzahlKilometer += current.getEntfernung();

            current = current.getNext();
        }

        anzahlKilometer += current.getEntfernung(); // für das letzte Element, oder Schleife bei current beginnen
        return anzahlKilometer;
    }

    public static void main(String[] args) {

        Route list = new Route();

        list.hinzufuegen(new Ankunftsort("Berlin", 0)); // sie erwartet einen Ankunftsort -> Konstruktor abgleichen, welche Werte zu erwarten sind
        list.hinzufuegen(new Ankunftsort("Potsdam", 35));
        list.hinzufuegen(new Ankunftsort("Magdeburg", 126));
        list.hinzufuegen(new Ankunftsort("Hannover", 149));

        System.out.println("Summe der Kilometer der Gesamtstrecke: " + list.gesamtStrecke());
    }
}