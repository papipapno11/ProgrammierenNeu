package Lek12.TestTelusko;

public class LinkedList {
    Node head; // referenziert das erste Element; automatisch null, falls Liste leer ist

    public void insert(int data) {

        // 1. Neuen Node erstellen
        // Node node = new Node(data); auch möglich
        Node node = new Node(); // erstellt ein neues Node-Objekt
        node.data = data; // weist dem Datenfeld des Nodes den übergebenen Wert zu
        node.next = null; // setzt die next-Referenz auf null, da der neue Knoten vorerst isoliert ist

        // 2. Überprüfen, ob die Liste leer ist
        if (head == null) {
            // wenn die Liste leer ist, wird der neue Node zum Head (Anfang) der Liste
            head = node;
        }
        else {
            // "wenn die Liste nicht leer ist, füge den Node am Ende der Liste ein"

            Node current = head; // 3. Temporäre Variable zum Durchlaufen der Liste erstellen

            // man kann sich das wie ein "int i = 0" in einer for-Schleife vorstellen
            while (current.next != null) { // 4. Schleife durch die Liste, um das Ende zu finden
                current = current.next; // solange der nächste Knoten !null ist, gehe zum nächsten Knoten
                // Jetzt wandert der Pointer um 1 weiter; hier ist sozusagen i++
            }
            current.next = node; // 5. Den neuen Node am Ende der Liste einfügen
        }
    }

    public void insertAtStart(int data) {

        // 1. Einen neuen Node erstellen
        Node node = new Node();
        node.data = data;
        node.next = null;

        // 2. Den neuen Node am Anfang der Liste einfügen
        node.next = head; // next-Referenz des neuen Nodes wird auf aktuellen Head gesetzt
        head = node; // Head wird auf neuen Node geschaltet; nun ist er das erste Element
    }

    public void insertAt(int index, int data) {

        // 1. Einen neuen Node erstellen
        Node node = new Node();
        node.data = data;
        node.next = null;

        // 2. Überprüfen, ob der Index 0 ist (Einfügen am Anfang)
        if (index == 0) {
            insertAtStart(data); // neuen Node am Anfang der Liste einfügen
        }
        else {
            // 3. Durchlaufe die Liste, um den Vorgänger des gewünschten Index zu finden
            Node n = head; // temporäre Variable
            for (int i = 0; i < index - 1; i++) { // Vorgänger finden durch travelling
                n = n.next;
            }
            // 4. Den neuen Node zwischen den Vorgänger und den nächsten Node einfügen
            node.next = n.next; // neuer Node "zeigt" auf den Node, auf den der Vorgänger vorher gezeigt hat
            n.next = node; // Vorgänger zeigt nun auf den neuen Node,
        }
    }

    public void deleteAt(int index) {

        // 1. Überprüfen, ob der Index 0 ist (Löschen am Anfang)
        if (index == 0) {
            head = head.next;
        }
        else {
            // 2. Temporäre Variablen für das Durchlaufen der Liste erstellen
            Node n = head; // Vorgänger finden
            Node n1 = null; // den zu löschenden Node halten

            // 3. Durchlaufe die Liste, um den Vorgänger des gewünschten Index zu finden
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            // 4. Temporäre Variable für den Node an der gewünschten Position erstellen
            n1 = n.next; // n1 soll gelöscht werden

            // 5. Den Vorgänger so anpassen, dass er den nächsten Node überspringt
            n.next = n1.next; // der zu löschende Node wird aus der Liste "herausgeschnitten"

            // 6. Den Node an der gewünschten Position löschen (auf null setzen)
            n1 = null; // aus dem Speicher zu entfernen; nicht nötiger Schritt
        }
    }

    public void sort() {

        if (head == null || head.next == null) {
            // Liste ist leer oder hat nur ein Element (bereits sortiert)
            return;
        }

        // Bubble-Sort Algorithmus
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node nextNode = head.next;

            while (nextNode != null) {
                if (current.data > nextNode.data) {
                    // Tausche die Daten der beiden Knoten
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;

                    swapped = true;
                }

                current = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);
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

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; // Speichere den nächsten Node
            current.next = previous; // Ändere die Richtung des nächsten Nodes
            previous = current; // Aktualisiere den Vorgänger auf den aktuellen Node
            current = nextNode; // Gehe zum nächsten Node in der ursprünglichen Reihenfolge
        }

        // Der letzte Node wird jetzt der neue Head
        head = previous;
    }

    public boolean search(int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                // Bedingung erfüllt, Wert gefunden
                return true;
            }
            current = current.next;
        }

        // Wert nicht gefunden
        return false;
    }

    public void show() {

        // 1. Einen Zeiger auf den Kopf der Liste setzen
        Node node = head;

        // 2. Durchlaufe die Liste und gib die Daten aus
        while (node.next != null) {
            System.out.println(node.data); // 3. Daten des aktuellen Knotens ausgeben
            node = node.next; // 4. Zum nächsten Knoten bewegen
        }
        // 5. Daten des letzten Knotens ausgeben (falls die Liste nicht leer ist)
        System.out.println(node.data);
    }
}