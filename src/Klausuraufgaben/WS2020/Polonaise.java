package Klausuraufgaben.WS2020;

public class Polonaise {

    Roboter head;

    public Polonaise() {
        this.head = null;
    }

    public void anhaengen(Roboter roboter) {

        if (head == null || head.getGroesse() > roboter.getGroesse()) {
            roboter.setNext(head);
            head = roboter;
        }
        else {
            Roboter current = head;
            while (current.getNext() != null && current.getNext().getGroesse() < roboter.getGroesse()) {
                current = current.getNext();
            }

            roboter.setNext(current.getNext());
            current.setNext(roboter);
        }
    }

    public void vorstellen() {
        Roboter current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    // nicht in Klausur gefragt
    public static void main(String []args) {

        Polonaise schlange = new Polonaise();

        Roboter ersterRoboter = new Roboter("Kaka", 190);
        Roboter zweiterRoboter = new Roboter("Melinaaa", 180);
        Roboter dritterRoboter = new Roboter("Markus", 175);

        schlange.anhaengen(ersterRoboter);
        schlange.anhaengen(zweiterRoboter);
        schlange.anhaengen(dritterRoboter);
        schlange.vorstellen();

    }
}