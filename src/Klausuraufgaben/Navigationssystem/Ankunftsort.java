package Klausuraufgaben.Navigationssystem;

public class Ankunftsort {

    private String name;
    private int entfernung;
    private Ankunftsort next;

    public Ankunftsort(String name, int entfernung) {
        this.name = name;
        this.entfernung = entfernung;
        this.next = null;
    }

    // Getter
    public String getName() {
        return name;
    }
    public int getEntfernung() {
        return entfernung;
    }
    public Ankunftsort getNext() {
        return next;
    }

    // Setter
    public void setNext(Ankunftsort next) {
        this.next = next;
    }

    public String toString() {
        return "Ort: " + name + ", Entfernung: " + entfernung + "km";
    }
}