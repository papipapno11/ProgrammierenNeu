package Lek5.skript;

public class Continue {
    public static void main(String[] args) {

// Addiere alle Zahlen von 1 bis 10, lasse aber dabei alle durch 5 teilbaren Zahlen aus
        int j = 0;
        int sum = 0;
        while(j < 10) {
            j++; // j++ muss hier gesetzt werden, da sonst die Schleife nicht funktioniert -> 0 % 5 == 0
            if (j % 5 == 0) continue;
            sum = sum + j;
            // j++ wäre nicht möglich aufgrund von continue-Anweisung
        }
        System.out.println(sum);
    }
}