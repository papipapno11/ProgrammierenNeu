package Klausuraufgaben;

public class Stringmethode {
    public static String konkat(String[] arr, String trennzeichen) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null || arr[i] != "") {
                result += arr[i];
                if (i < arr.length - 1) { // um letztes Element zu überspringen
                    result += trennzeichen;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] a = {"Gurken", "Mehl", "Milch", "Karotten"};
        String[] b = {"Gurken"};
        String[] c = {""};
        String[] d = {};

        String trennzeichen = ";";

        System.out.println(konkat(b, trennzeichen));
        System.out.println(konkat(a, trennzeichen));
        System.out.println(konkat(c, trennzeichen));
        System.out.println(konkat(d, trennzeichen));
    }
}