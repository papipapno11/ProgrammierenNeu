package Klausuraufgaben;

public class Produktpreise2 {
    public static void main(String[] args) {

        char[] ergebnis = convertToCents("00008,40");

        for(int i = 0; i < ergebnis.length; i++) {
            System.out.print(ergebnis[i]);
        }

        System.out.println();
    }

    public static char[] convertToCents(String eingabe){

        char[] result = null;

        eingabe = eingabe.replace(",", "");
        String zwischenergebnis = "";
        boolean nullenVorbei = false;

        int i = 0; // auch außerhalb initialisierbar, um sie außerhalb der Schleife zu nutzen
        for(; i < eingabe.length(); i++){
            if(!nullenVorbei && eingabe.charAt(i) == '0'){

            }
            else {
                zwischenergebnis += eingabe.charAt(i);
                nullenVorbei = true; // ab jetzt nur noch else
            }
        }

        return zwischenergebnis.toCharArray();
    }
}