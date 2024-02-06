package Lek12.EchteLottoziehung;
import java.util.Random;

public class List {

    Node head;
    Random rand = new Random();

    public List() {

        head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 49; i++) {
            Node newNode = new Node(i);
            current.next = newNode;
            current = newNode;
        }
    }

    public int getSize() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public int drawNumber() {
        int target_pos = rand.nextInt(getSize());

        int pos = 0;
        int result = -1;

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (pos == target_pos) {
                result = current.data;
                if (previous == null) {
                    head = current.next;
                }
                else {
                    previous.next = current.next;
                }
            }
            pos++;
            previous = current;
            current = current.next;
        }

        return result;
    }

    public static void main(String[] args) {

        List lst = new List();
        for (int i = 0; i < 6; i++) {
            System.out.println(lst.drawNumber());
        }
    }
}