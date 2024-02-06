package Lek11.Ticker;

public class Ticker {

    private char[] nachricht;

    // Liefert die Größe des Nachrichtenpuffers zurück
    public int getGroesse() {
        return this.nachricht.length;
    }

    // Gibt eine Kopie des kompletten Nachrichtenpufferinhalts zurück
    public String getNachricht() {
        return String.copyValueOf(this.nachricht);
    }

    // Setzt den Nachrichtenpuffer auf die übergebene Zeichenfolge
    public void setNachricht(char[] nachricht) {
        for (int i = 0; i < this.nachricht.length; i++) {
            if (i < nachricht.length) {
                this.nachricht[i] = nachricht[i];
            }
            else {
                this.nachricht[i] = '+';
            }
        }
    }

    // Überschreibt den kompletten Inhalt des Nachrichtenpuffers mit dem Zeichen "zeichen"
    public char[] resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = zeichen;
        }
        return this.nachricht;
    }

    // Überschreibt den kompletten Inhalt des Nachrichtenpuffers mit dem Pluszeichen (+)
    public char[] resetNachricht() {
        return resetNachricht('+');
    }

    // Rotiert den Nachrichtenpuffer um die angegebene Distanz
    public void rotateNachricht(int distance) {
        char[] tempNews = getNachricht().toCharArray(); // Erzeugung einer Kopie
        int length = this.nachricht.length;

        for (int i = 0; i < length; i++) {
            this.nachricht[i] = tempNews[(i + distance) % length];
        }
    }

    // Standardkonstruktor
    public Ticker() {
        this(200);
    }

    public Ticker(int groesse) {
        if (groesse <= 0) {
            groesse = 200;
        }

        this.nachricht = new char[groesse];
        resetNachricht(' ');
    }
}