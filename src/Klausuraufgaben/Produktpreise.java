package Klausuraufgaben;

public class Produktpreise {
    public static char[] convertToCents(String str) {

        char[] charArray = null;

        str = str.replace(",", "");

        charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0') {
                charArray[i] = 'a';
            }
            else {
                break; // hier wird der loop beendet, ohne restliche Nullen zu beachten
            }
        }

        // a's entfernen
        String x = String.valueOf(charArray);
        x = x.replace("a", "");
        charArray = x.toCharArray();

        return charArray;
    }

    public static void main(String[] args) {

        char[] result = convertToCents("0,09");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}