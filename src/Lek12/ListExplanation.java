package Lek12;

public class ListExplanation {

    //best tutorial on this topic: https://www.youtube.com/watch?v=SMIq13-FZSE&t=436s

    //Beim coden sich die Nodes und alles immer auf ein Blatt papier malen und das so machen also ob es ne Leetcode aufgabe wäre

    //Einfach immer sich skizzen machen und dann ist das eZZZZ



    //Erste Klasse "Node", welche wir als 1. immer brauchen für eine Liste

    public class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value; // Wert für den Node
            this.next = null; // wenn wir ein einzelnes Node erstellen, dann gibt es erstmal keinen nächsten wert --> Deswegen null

        }

    }

    //Zweite Klasse "LinkedList", welche die eigentliche Liste darstellst und wir immer als 2. brauchen


    public class LinkedList {
        //Jede Liste hat einen "Head" --> Das markiert sozusagen den Anfang der Liste und nur damit kann die Liste anfangen -->Wenn wir die Liste ausgeben wollen dann fangen wir beim Node head an
        Node head; //ist der erste Node immer.  -->Und ist automatisch "null", falls kein Element in der List ist

        public void insertAtTheEnd (int value) {

            Node newNode = new Node(value); //Wir müssen als erstes mal den Knotenpunkte / Node erstellen, denn wir dann am Ende der Liste hinzufügen wollen

            newNode.next = null; //Diese Zeile code braucht man nicht, aber ich mach es zur verdeutlichung hin

            if (head==null) {  //Wenn beim head noch kein node ist, dann wird der neue node der head
                head = newNode;

            }
            else {
                Node current = head;    //Wir machen einen Pointer um an das Ende der Liste zu kommen. Von Konventionen her nennt man, dass "current"
                //Man kann sich das ganze wie ein "int i = 0" in einer For-Schleife vorstellen

                while (current.next!=null)  {


                    current = current.next; //Jetzt machen wir den Pointer 1 weiter   //hier ist das sozusagen i = i+1 bzw. i++;
                }
                current.next = newNode;

            }

        }

        public void insertSort(int val) {
            Node newNode = new Node(val); //erstellung eines neuen Elements (Knotenpunkt)

            // Wenn die Liste leer ist oder der neue Wert kleiner als der erste Wert ist
            if (head == null || val < head.value) {
                newNode.next = head;
                head = newNode;
            }


            else {
                Node current = head;

                // Suche die Stelle, an der der neue Wert eingefügt werden soll
                while (current.next != null && current.next.value < val) {
                    current = current.next;
                }

                // Füge den neuen Wert an der gefundenen Stelle ein
                newNode.next = current.next;
                current.next = newNode;
            }
        }


        //Jetzt noch   und InsertionsAtValue -->Der hinzugefügt Node wird an dem passenden Ort in einer Sortierten Liste hinzugefügt.  Und noch NoteDeletion machen mit einem Index und einmal WErt vom Node


        public void insertAtGivenIndex(int val, int index) {
            Node newNode = new Node(val);
            //Ungültiger Index
            if (index < 0) {
                System.out.println("Ungültiger Index. Der Index sollte nicht negativ sein.");
                return;
            }
            //Überprüft ob das neue Node am Anfang seins olll

            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            int count = 0;

            //Sucht nach dem Index bevor dem Einfügen
            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Index außerhalb der Grenzen. Der Index sollte nicht größer als die Länge der Liste sein.");
                return;
            }

            newNode.next = current.next;
            current.next = newNode;
        }


        public void show () {

            //Wir machen wieder einen Pointer
            Node current = head; //Und der Pointer fäng beim head natürlich an
            while (current!=null) {
                System.out.print(current.value +"  ");

                current = current.next; // Pointer wird sozusagen wieder um 1 erhöht

            }
        }


        public void deleteNode(int val) {

            Node current = head;
            Node prev = null;
            if (head.value ==val) {
                head = head.next;

            }

            else {
                while (current!=null && current.value !=val) {
                    prev = current;
                    current = current.next;

                }

                if (current==null) {
                    System.out.println("Der gegebenen Wert exisitiert nicht in der Liste");
                    return;
                }
                else {
                    prev.next = current.next;

                }
            }
        }


        public void deleteNodeAtGivenIndex (int index) {  //Arbeite mit Indexen und Indexe fangen immer mit 0 an, also der erste Wert ist der 0-Index

            if (index==0) {
                head = head.next;

            }
            else {
                Node current = head;
                Node prev = null;
                while (current!=null && index-1>=0 ) {
                    prev = current;
                    current = current.next;
                    index--;

                }
                if (current==null) {
                    System.out.println("Ungültiger Index"); return;
                }
                else {
                    prev.next = current.next;

                }
            }
        }




        public void deletingATindex(int index) {

            Node prev = null;
            Node current = head;


            if (index==0) { head = head.next; return;}

            //go to the index in the list

            while (current!=null && index>0) {
                prev = current;
                current = current.next;
                index--;
            }

            if (current==null) {
                System.out.println("Angegbener Index wurde nicht gefunden"); return;
            }

            prev.next = current.next;
        }

        public int searchNode (int val) { //gibt einen Index Wert zurück und Index fängt immer mit 0 an
            int zeahler = 0;
            Node current = head;
            while (current!=null && current.value !=val) {
                zeahler++;
                current = current.next;
            }
            if (current==null) {
                System.out.println("Fehler, Node existiert nicht in der Liste");
                return -1;

            }


            return zeahler;
        }

        public boolean doesNoteExist (int val) {
            if (head.value == val) return true;
            else {
                Node current = head;
                while (current!=null && current.value !=val) {
                    current = current.next;
                }

                if (current==null) return false;

                return true;

            }
        }
    }

    //3 Klasse für das eigentlich Programm, hier ist es mir nur ein bisschen mislungen, weil wir erst ein ListenErklärt Objekt machen müssen, was ein bissle dumm ist, aber sonst funktioniert alles genaus.
    public static void main(String[] args) {
        ListExplanation lottoList = new ListExplanation();

        LinkedList liste = lottoList.new LinkedList();

        // Insert some elements into the list
        liste.insertAtTheEnd(1);

        liste.insertAtTheEnd(2);
        liste.insertAtTheEnd(5);
        liste.insertSort(5);
        // liste.insertAtGivenIndex(10, 0);
        // liste.deleteNodeAtGivenIndex(3);
        // liste.deleteNode(5);
        // liste.deleteNodeAtGivenIndex(1);
        // Display the elements of the list
        // int ort = liste.searchNode(2);
        // System.out.println(ort);

        System.out.println(liste.doesNoteExist(3));


        liste.show();

    }
}