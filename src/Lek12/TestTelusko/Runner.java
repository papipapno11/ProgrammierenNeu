package Lek12.TestTelusko;

public class Runner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(18);
        list.insert(45);
        list.insert(3);
        list.insert(12);

        list.insertAtStart(25);
        list.insertAt(0, 55);

        list.deleteAt(2);

        System.out.println("Anzahl der Elemente in der Liste: " + list.getSize());

        System.out.println("\nUrsprüngliche Liste:");
        list.show();

        list.sort();

        System.out.println("\nSortierte Liste:");
        list.show();

        list.reverse();
        System.out.println("\nUmgekehrte Liste:");
        list.show();

        int target = 17;
        boolean found = list.search(target);

        if (found) {
            System.out.println("\nDer Wert " + target + " wurde gefunden!");
        }
        else {
            System.out.println("\nDer Wert " + target + " wurde nicht gefunden!");
        }
    }
}