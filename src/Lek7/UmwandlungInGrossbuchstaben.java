package Lek7;
import java.util.Scanner;

public class UmwandlungInGrossbuchstaben {
    public static String inGrossbuchstaben (char[] charArray) {
        for (int i =0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray [i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Text hier ein: ");
        String text = scan.nextLine();

        /*
        int laenge = text.length();
        char[] charArray = new char[laenge];

        for (int i = 0; i < laenge; i++) {
            charArray [i] = text.charAt(i);
        }
         */

        char[] charArray = text.toCharArray();

        System.out.println("Ihr Text in Großbuchstaben: " + inGrossbuchstaben(charArray));
        scan.close();
    }
}