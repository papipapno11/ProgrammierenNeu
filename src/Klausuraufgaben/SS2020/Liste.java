package Klausuraufgaben.SS2020;

public class Liste {

    Node end; // normalerweise head, aber Liste startet am Ende

    public Liste() {
        this.end = null;
    }

    public void einfuegen(String name) {

        Node node = new Node(name);

        if (end == null) {
            end = node;
        }
        else {
            Node current = end;
            while (current.prev != null) {
                current = current.prev;
            }
            current.prev = node;
        }
    }

    @Override
    public String toString() {

        String ergebnis = "";

        Node current = end;
        while (current != null) {
            ergebnis += current.name + " ";
            current = current.prev;
        }

        return ergebnis;
    }

    public static void main(String[] args) {

        Liste list = new Liste();

        list.einfuegen("Cool");
        list.einfuegen("Zylla");
        list.einfuegen("Aaronson");

        System.out.println("Aktuelle Liste: " + list);

        list.einfuegen("Element4");

        System.out.println("Aktualisierte Liste: " + list);
    }
}