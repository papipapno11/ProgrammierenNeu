package Lek8.PersonAttribute;

public class Hauptprogramm {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.vorname = "Joe";
        p1.nachname = "Cool";
        p1.username = "jcool";

        p2.vorname = "Doug";
        p2 = p1;

        System.out.println(p2.vorname);
    }
}