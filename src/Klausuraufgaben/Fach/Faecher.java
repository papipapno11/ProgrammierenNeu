package Klausuraufgaben.Fach;

public class Faecher { // repräsentiert eine Tür

    private int nummer;
    private boolean offen;

    // Konstruktor
    public Faecher(int nummer) {
        this.nummer = nummer;
        this.offen = false; // Tür ist standardmäßig für jedes Objekt geschlossen -> nur durch setOpened() anpassbar
    }

    // Getter
    public int getNummer() {
        return nummer;
    }
    public boolean isOffen() { // Lesezugriff von offen -> false (geschlossen)
        return offen;
    }

    // Setter
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    public void setOffen(boolean offen) {
        this.offen = offen;
    }

    public String toString() {
        if (this.offen) {
            return "o";
        }
        else {
            return "z";
        }
    }
}