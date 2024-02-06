package Lek11.Textdokument;

public class Textdokument {

    private char[][] textdokument; // [zeilen][spalten]

    public int zaehleZeichen() {
        int counter = 0;

        for (int i = 0; i < this.textdokument.length; i++) {
            for (int j = 0; j < this.textdokument[i].length; j++) {
                if (this.textdokument[i][j] != ' ') {
                    counter++;
                }
            }
        }

        return counter;
    }

    public boolean vertauscheZeilen (int zeile1, int zeile2) {

        int z1 = zeile1 - 1;
        int z2 = zeile2 - 1;
        boolean isSwitched;

        if (zeile1 > this.textdokument.length || zeile1 < 1 || zeile2 > this.textdokument.length || zeile2 < 1) {
            isSwitched = false;
        }
        else {
            char[] temp = this.textdokument[z1];
            this.textdokument[z1] = this.textdokument[z2];
            this.textdokument[z2] = temp;
            isSwitched = true;
        }

        return isSwitched;
    }

    public void fuegeEinTextdokument(char[][] einfuegeText, int startZeile) { // text = alter Text

        int neueLaenge = einfuegeText.length + this.textdokument.length; // neue Länge: alt + neu
        char[][] neuerText = new char[neueLaenge][]; // nur neue Zeilenanzahl; leeres 2D-Array
        startZeile--; // Korrektur auf 0-basierte Zeilenposition

        if (startZeile <= this.textdokument.length && startZeile >= 0) { // gültiges Einfügen
            int textdokumentIndex = 0; // Index alter Text
            int neuerTextIndex = 0; // Index neuer Text

            for (int i = 0; i < neueLaenge; i++) {
                if (i >= startZeile && i < (startZeile + einfuegeText.length)) {
                    neuerText[i] = einfuegeText[neuerTextIndex];
                    neuerTextIndex++;
                }
                else {
                    neuerText[i] = this.textdokument[textdokumentIndex];
                    textdokumentIndex++;
                }
            }
            this.textdokument = neuerText;
        }
        else { // ungültiges Einfügen
            throw new RuntimeException("Ungültige Zeilenposition");
        }
    }

    public String getTextdokument() {

        String str = "";
        for (int i = 0; i < this.textdokument.length; i++) {
            str += String.valueOf(this.textdokument[i]) + "\n";
        }

        return str;
    }

    public Textdokument(char[][] text) {
        this.textdokument = text;
    }
}