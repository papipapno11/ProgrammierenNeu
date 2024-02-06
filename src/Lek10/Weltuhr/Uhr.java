package Lek10.Weltuhr;

public class Uhr {

    private int std, min, sek;

    // Getter
    public int getStd() {
        return std;
    }
    public int getMin() {
        return min;
    }
    public int getSek() {
        return sek;
    }

    // Setter
    public void setUhr (int std, int min, int sek) {
        if (std <= 23 && std >= 0 && min <= 59 && min >= 0 && sek <= 59 && sek >= 0) {
            this.std = std;
            this.min = min;
            this.sek = sek;
            System.out.println("Neue Uhrzeit gesetzt: " + std + ":" + min + ":" + sek + " Uhr");
        } else {
            System.out.println("Ihre Eingabe ist ungültig! Die Uhrzeit bleibt");
        }
    }

    public void naechsteSek () {
        sek++;
        if (sek == 60) {
            this.sek = 0;
            min++;
            if (min == 60) {
                this.min = 0;
                std++;
                if (std == 24) {
                    this.std = 0;
                    this.sek = 0;
                }
            }
        }
    }


    // Konstruktor
    public Uhr(int std, int min, int sek) {
        if(std <= 23 && std >= 0 && min <= 59 && min >= 0 && sek <= 59 && sek >= 0) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        }
        else {
            this.std = 12;
            this.min = 0;
            this.sek = 0;
        }
    }
}