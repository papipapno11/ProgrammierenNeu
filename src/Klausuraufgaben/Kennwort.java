package Klausuraufgaben;

public class Kennwort {

    private String zeichenkette;

    public Kennwort(String zeichenkette) {
        if (alsPWgeeignet(zeichenkette)) {
            this.zeichenkette = zeichenkette;
        }
        else {
            this.zeichenkette = null;
        }
    }

    public boolean alsPWgeeignet(String passwort) {

        if (passwort.length() < 9) {
            return false;
        }

        boolean gross = false;
        boolean klein = false;
        boolean ziffer = false;

        for(int i = 0; i < passwort.length(); i++) {
            char c = passwort.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                gross = true;
            }

            if(c >= 'a' && c <= 'z') {
                klein = true;
            }

            if(c >= '0' && c <= '9') {
                ziffer = true;
            }
        }

        if(gross && klein && ziffer) {
            return true;
        }

        return false;
    }

        public String toString() {

            String passwort = "";

            if (zeichenkette == null) {
                return "Kein gültiges Kennwort";
            }
            else {
                for (int i = 0; i < zeichenkette.length(); i++) {
                    passwort += "*";
                }
            }

            return passwort;
        }

        public boolean pwAendern(String neu) {

            if (neu == null) {
                return false;
            }

            if (alsPWgeeignet(neu) && !neu.equals(zeichenkette)) {
                if (neu.charAt(0) != zeichenkette.charAt(0) && neu.charAt(neu.length() - 1) != zeichenkette.charAt(neu.length() - 1)) {
                    zeichenkette = neu; // Überschreibung
                    return true;
                }
            }

            return false;
        }

    public static void main(String[] args) {

        Kennwort k = new Kennwort("HalloJo123");
        System.out.println(k);
        System.out.println(k.pwAendern("DalloJo124"));
    }
}