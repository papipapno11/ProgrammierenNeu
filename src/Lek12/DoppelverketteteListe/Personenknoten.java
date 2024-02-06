package Lek12.DoppelverketteteListe;

public class Personenknoten {

    private String nachname;
    private int alter;

    Personenknoten next;
    Personenknoten prev;

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public Personenknoten(String name, int alter) {
        this.nachname = name;
        this.alter = alter;
    }
}