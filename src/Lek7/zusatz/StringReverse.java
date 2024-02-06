package Lek7.zusatz;

public class StringReverse {
    public static String reverse (String str) {

        char [] charArray = new char [str.length()];
        charArray = str.toCharArray();

        int ende = charArray.length - 1;

        for (int i = 0; i < ende; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[ende];
            charArray[ende] = temp;
            ende--;
        }

        for (int j = 0; j < charArray.length; j++) {
            System.out.print(charArray[j]);
        }

        return "";
    }

    public static void main(String[] args) {

        String str = "Übung Programmieren I";
        System.out.print(str + " -> ");

        String reversed = reverse(str);
    }
}