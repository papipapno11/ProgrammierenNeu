package Lek4;

public class DasKleineEinmaleins {
    public static void main(String[] args) {

        int ergebnis;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                ergebnis = i * j;
                System.out.println(i + " x " + j + " = " + ergebnis);
            }
            System.out.println();
        }
    }
}