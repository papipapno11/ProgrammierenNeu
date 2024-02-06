package Klausuraufgaben.Timeline;

public class Chronik {

    private Beitrag head;

    public void fuegeBeitragEin(Beitrag neu) {

        neu.setNext(head);
        head = neu;
    }

    public void ausgeben() {

        Beitrag current = head;
        while (current != null) { // um alle Elemente auszugeben
            System.out.println(current.getAbsender() + " -> " + current.getEmpfaenger());
            System.out.println(current.getText());
            System.out.println();
            current = current.getNext();
        }
    }

    public static void main(String[] args) {

        Chronik list = new Chronik();
        list.fuegeBeitragEin(new Beitrag("Viele Grüße zum Tag der Stühle!", "Jonas", "Michael"));
        list.fuegeBeitragEin(new Beitrag("Jonas ist sehr lustig!", "Michael", "Hans"));
        list.fuegeBeitragEin(new Beitrag("Ich habe gehört, du bist lustig!", "Hans", "Jonas"));

        list.ausgeben();
    }
}