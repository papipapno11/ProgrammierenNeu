package Lek8;
import java.util.Scanner;
import java.util.Arrays;

public class Galgenmaennchen {
    public static char[] woerter () {

        String[] woerter = {"PROGRAMMIERSPRACHE", "WIRTSCHAFTSINFORMATIK", "ERSTES SEMESTER", "PROGRAMMIEREN", "JAVA",
                "ECLIPSE", "LEKTION ACHT", "GALGENMAENNCHEN", "CONSOLE", "UEBUNG", "BACHELOR", "ENGINEERING",
                "HOCHSCHULE", "ARRAY", "METHODE", "KLASSE", "PACKAGE", "INTEGER", "STRING", "SCANNER"};

        int randomWort = (int) (Math.random() * woerter.length);
        return woerter[randomWort].toCharArray();
    }

    public static void spiel(char[] wort) {

        Scanner scanner = new Scanner(System.in);
        char[] geraten = new char[wort.length]; // neuen charArray mit der Länge des random Wortes für "_"

        for (int k = 0; k < geraten.length; k++) {
            geraten[k] = '_';
        }
        // Arrays.fill(geraten, '_'); // füllt den charArray "geraten" mit '_' in der Länge des übergebenen charArrays

        int versuche = 0;

        String wortStr = String.valueOf(wort); // übergebenes Wort in String umwandeln
        String geratenStr = "";

        while (versuche < 15 && !wortStr.equals(geratenStr)) { // läuft bis zu 15 Durchläufe lang
            System.out.print("\n" + (versuche + 1) + ". Versuch: "); // Ausgabe 1., 2., .. Versuch

            for (int i = 0; i < geraten.length; i++) {
                char n = geraten[i];
                System.out.print(n + " "); // Ausgabe für "_"
            }

            char eingeben = scanner.nextLine().charAt(0); // mein Rateversuch

            for (int j = 0; j < wort.length; j++) {
                String x = Character.toString(eingeben).toUpperCase(); // jede Standardeingabe wird einem String übergeben und großgeschrieben

                if (String.valueOf(wort[j]).equals(x)) {
                    geraten[j] = wort[j];
                }
            }
            versuche++;
            geratenStr = String.valueOf(geraten);
        }

        ausgabe(versuche, wortStr, geratenStr);
        scanner.close();
    }

    public static void ausgabe(int versuche, String wortStr, String geratenStr) {

        if (versuche == 15 || !wortStr.equals(geratenStr)) {
            System.out.println("Sie haben verloren! Das gesuchte Wort ist: " + wortStr);
        }
        else {
            System.out.println(geratenStr + "\r\n" + "Herzlichen Glückwunsch! Sie haben gewonnen!");
        }
    }

    public static void main(String[] args) {

        char[] charArray = woerter();
        spiel(charArray);
    }
}