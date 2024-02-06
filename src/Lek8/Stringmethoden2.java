package Lek8;

public class Stringmethoden2 {
    public static String deleteStartingSpace(String sentence) {

        int index = 0;
        int laenge = sentence.length();

        while (index < laenge && sentence.charAt(index) == ' ') {
            index++;
        }

        return sentence.substring(index, laenge);
    }

    public static String deleteEndingSpace(String sentence) {

        int index = sentence.length() - 1; // letztes Zeichen
        while (index >= 0 && sentence.charAt(index) == ' ') {
            index--;
        }

        return sentence.substring(0, index + 1); // .substring(int beginnIndex, endIndex - 1)
    }

    public static String deleteMultipleSpace(String sentence) {

        // überprüfen, ob zwei aufeinanderfolgende Leerzeichen (Substring) gefunden wurden
        while (sentence.indexOf("  ") >= 0) {
            sentence = sentence.replace("  ", " ");
        }

        return sentence;
    }

    public static String[] splitAtSpace(String sentence) {

        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // "Ich gehe morgen mit meinen 11 Freund*innen zum Essen!"
        String[] result = new String[wordCount + 1];
        int startIndex = 0;
        int arrayIndex = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') { // i: 3
                result[arrayIndex] = sentence.substring(startIndex, i); //
                startIndex = i + 1;
                arrayIndex++;
            }
        }

        result[arrayIndex] = sentence.substring(startIndex);
        return result;
    }

    public static void main(String[] args) {

        // zählen der Zeichen bei Strings beginnt auch bei 0
        String sentenceA = "  Ich gehe morgen mit meinen 11 Freund*innen zum Essen!  ";
        System.out.println("a)");
        System.out.println(deleteStartingSpace(sentenceA));

        System.out.println("b)");
        System.out.println(deleteEndingSpace(sentenceA));

        String sentenceB = "Ich gehe  morgen mit meinen   11 Freund*innen zum  Essen!";
        System.out.println("c)");
        System.out.println(deleteMultipleSpace(sentenceB));

        String sentenceC = "Ich gehe morgen mit meinen 11 Freund*innen zum Essen!";
        System.out.println("d)");
        String[] resultArray = splitAtSpace(sentenceC);

        System.out.println("Index:" + "\t" + "Inhalt");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(i + ": " + "\t\t" + resultArray[i]);
        }
    }
}