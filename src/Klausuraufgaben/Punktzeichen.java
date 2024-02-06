package Klausuraufgaben;

public class Punktzeichen {
    public static int replace(char[] dateiname) {

        int anzahlZeichen = 0;

        for (int i = 0; i < dateiname.length; i++) {
            if (dateiname[i] == '.' && i != dateiname.length - 4) { // um letzten Punkt zu umgehen
                dateiname[i] = '_';
                anzahlZeichen++;
            }
        }

        return anzahlZeichen;
    }

    public static void main(String[] args) {

        String eingabe = "database.settings.file.dat";
        char[] charArray = eingabe.toCharArray();

        int anzahlGeandert = replace(charArray);

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
}