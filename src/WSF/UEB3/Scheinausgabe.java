package WSF.UEB3;
import java.util.Scanner;

public class Scheinausgabe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wie groß ist der Geldbetrag: ");
        int geldbetrag = scan.nextInt();

        int count500 = 0, count200 = 0, count100 = 0, count50 = 0, count20 = 0, count10 = 0, count5 = 0;

        if (geldbetrag >= 500) {
            count500 = geldbetrag / 500; // wie oft passt die 500 rein?
            geldbetrag %= 500; // Restbetrag nach den 500 Euro
        }

        if (geldbetrag >= 200) {
            count200 = geldbetrag / 200;
            geldbetrag %= 200;
        }

        if (geldbetrag >= 100) {
            count100 = geldbetrag / 100;
            geldbetrag %= 100;
        }

        if (geldbetrag >= 50) {
            count50 = geldbetrag / 50;
            geldbetrag %= 50;
        }

        if (geldbetrag >= 20) {
            count20 = geldbetrag / 20;
            geldbetrag %= 20;
        }

        if (geldbetrag >= 10) {
            count10 = geldbetrag / 10;
            geldbetrag %= 10;
        }

        if (geldbetrag >= 5) {
            count5 = geldbetrag / 5;
            geldbetrag %= 5;
        }

        System.out.println("500er-Scheine: " + count500);
        System.out.println("200er-Scheine: " + count200);
        System.out.println("100er-Scheine: " + count100);
        System.out.println("50er-Scheine: " + count50);
        System.out.println("20er-Scheine: " + count20);
        System.out.println("10er-Scheine: " + count10);
        System.out.println("5er-Scheine: " + count5);

        scan.close();
    }
}