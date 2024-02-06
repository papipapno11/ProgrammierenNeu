package Lek12.DoppelverketteteListe;

public class Liste {
    Personenknoten start;

    public void addSorted(Personenknoten p) {
        if(start == null) {
            start = p;
        }
        else if(p.getAlter() < start.getAlter()) {
            p.next = start;
            start.prev = p;
            start = p;
        }
        else { // Mitte
            Personenknoten temp = start;
            boolean success = false;

            while(temp.next != null && !success) {
                if(p.getAlter() < temp.next.getAlter()) {
                    p.prev = temp;
                    p.next = temp.next;

                    temp.next.prev = p;
                    temp.next = p;

                    success = true;
                }
                temp = temp.next;
            }
            if(!success) { // Ende
                p.prev = temp;
                temp.next = p;
            }
        }
    }

    public Personenknoten searchByName(String name) {
        Personenknoten temp = start;

        while(temp != null) {
            if(temp.getNachname().equals(name))
                return temp;

            temp = temp.next;
        }
        return null;
    }

    public void printForwards() {
        Personenknoten temp = start;
        while(temp != null) {
            System.out.println(temp.getNachname());
            temp = temp.next;
        }
    }

    public void printBackwards() {
        Personenknoten temp = start;

        // Zuerst an letzten Knoten gehen
        while(temp.next != null) {
            temp = temp.next;
        }

        while(temp != null) {
            System.out.println(temp.getNachname());
            temp = temp.prev;
        }
    }


    public static void main(String[] args) {
        Liste list = new Liste();

        list.addSorted(new Personenknoten("Angela", 47));
        list.addSorted(new Personenknoten("Max", 24));
        list.addSorted(new Personenknoten("Eva", 27));
        list.addSorted(new Personenknoten("Romeo", 19));
        list.addSorted(new Personenknoten("Julia", 18));

        list.printForwards();
        System.out.println("----------");

        list.printBackwards();
        System.out.println("----------");
        System.out.println(list.searchByName("Eva").getNachname());
    }
}