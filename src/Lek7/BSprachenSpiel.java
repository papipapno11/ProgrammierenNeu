package Lek7;
import java.util.Scanner;

public class BSprachenSpiel {
    public static String spielen (String text) {

        // char [] charArray = new char[text.length()]; überflüssig, da direkt überschrieben
        char [] charArray = text.toCharArray();

        int laenge = 0;
        for (int i = 0; i < charArray.length; i++) {
            char n = charArray[i];
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                laenge += 2;
            }
            laenge++;
        }

        char [] newArray = new char[laenge];
        int k = 0; // mit dieser Variablen wird auf das neue Array zugegriffen

        for (int j = 0; j < charArray.length; j++) {
            newArray[k] = charArray[j];
            /* Die Zeile newArray[k] = charArray[j]; kopiert das Zeichen an der Position j
            im charArray in das newArray an der Position k. Danach wird k um eins erhöht, um
            auf das nächste freie Element im newArray zu zeigen, um sicherzustellen, dass
            das nächste Zeichen dort platziert wird. */

            switch(charArray[j]) {
                case 'a'-> {
                    newArray[k+1] = 'b';
                    newArray[k+2] = 'a';
                    k+=2;
                }
                case 'e' -> {
                    newArray[k+1] = 'b';
                    newArray[k+2] = 'e';
                    k+=2;
                }
                case 'i' -> {
                    newArray[k+1] = 'b';
                    newArray[k+2] = 'i';
                    k+=2;
                }
                case 'o' -> {
                    newArray[k+1] = 'b';
                    newArray[k+2] = 'o';
                    k+=2;
                }
                case 'u' -> {
                    newArray[k+1] = 'b';
                    newArray[k+2] = 'u';
                    k+=2;
                }
            }
            k++; // hier wird auf das nächste freie Element in newArray gezeigt
        }
        return String.valueOf(newArray);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Text ein: ");
        String text = scan.nextLine();

        System.out.println("Übergebene Zeichenfolge: " + text);
        System.out.println("Zurückgelieferte Zeichenfolge: " + spielen(text));

        scan.close();
    }
}
/* Anstelle von switch-Anweisung, auch mit ifs lösbar
for (int z = 0; z < charArray.length; z++) {
    newArray[k] = charArray[z];

    if (charArray[z] == 'a') {
        newArray[k + 1] = 'b';
        newArray[k + 2] = 'a';
        k += 2;
    } else if (charArray[z] == 'e') {
        newArray[k + 1] = 'b';
        newArray[k + 2] = 'e';
        k += 2;
    } else if (charArray[z] == 'i') {
        newArray[k + 1] = 'b';
        newArray[k + 2] = 'i';
        k += 2;
    } else if (charArray[z] == 'o') {
        newArray[k + 1] = 'b';
        newArray[k + 2] = 'o';
        k += 2;
    } else if (charArray[z] == 'u') {
        newArray[k + 1] = 'b';
        newArray[k + 2] = 'u';
        k += 2;
    }
    k++;
} */