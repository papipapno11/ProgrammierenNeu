package Lek8;
import java.util.Scanner;

public class CountUpperCase {
    public static int countUpperCaseCharacters(String sentence) {

        char[] chars = sentence.toCharArray();
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Text ein: ");
        String sentence = scanner.nextLine();

        int result = countUpperCaseCharacters(sentence);
        System.out.println("Anzahl Großbuchstaben: " + result);

        scanner.close();
    }
}