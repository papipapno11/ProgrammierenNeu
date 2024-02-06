package Klausuraufgaben;

public class Student {

    private String name;
    private int alter;
    private Student[] arr;

    // Konstruktor
    public Student(int alter) {
        // Initialisierung vom Studentenobjekt mit dem zufälligen Alter
        // setzt das Alter des Studentenobjekts auf den übergebenen Wert
        this.alter = alter;
    }

    // Getter
    public int getAlter() {
        return alter;
    }

    // toString für Konsolenausgabe
    public String toString() {
        // * impliziter Objekt-Aufruf aufgrund von "System.out.println(arr[i])"
        return "Student ist " + alter + " Jahre alt";
    }

    public static Student[] mind19(Student[] arr) {

        Student[] result = null; // Methode gibt Array von Studenten am Ende zurück

        int anzahl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAlter() >= 19) {
                anzahl++;
            }
        }
        result = new Student[anzahl];

        int indexArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAlter() >= 19) {
                result[indexArray] = arr[i];
                indexArray++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Student[] arr = new Student[100]; // 100 Student-Objekte anlegen

        // Studenten mit zufälligem Alter zwischen 16 und 29
        for (int i = 0; i < arr.length; i++) {
            int alter = (int) (Math.random() * 14) + 16;
            arr[i] = new Student(alter); // 100 Studenten erhalten ein zufälliges Alter
            // * durch den Aufruf von "System.out.println(arr[i])" wird die toString() Methode aufgerufen
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");

        // Studenten, die mindestens 19 Jahre alt sind
        Student[] result = mind19(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}