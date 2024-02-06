package Klausuraufgaben.WS2020;

public class Roboter {

    private String name;
    private int groesse;
    private Roboter next;

    public Roboter(String name, int groesse) {
        this.name = name;
        this.groesse = groesse;
        this.next = null;
    }

    // Getter
    public String getName() {
        return name;
    }
    public int getGroesse() {
        return groesse;
    }
    public Roboter getNext() {
        return next;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
    public void setNext(Roboter next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Hallo ich bin " + this.name + ", ich bin " + this.groesse + " Zentimeter groß";
    }
}