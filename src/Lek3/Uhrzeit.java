package Lek3;
import java.util.Scanner;

public class Uhrzeit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Stunden an: ");
        int stunden = scan.nextInt();
        System.out.println("Geben Sie bitte die Minuten an: ");
        int minuten = scan.nextInt();
        System.out.println("Geben Sie bitte die Sekunden an: ");
        int sekunden = scan.nextInt();

        boolean uhrzeitIsCorrect = true;

        while (uhrzeitIsCorrect) {
            if ((stunden >= 0 && stunden <= 23) && (minuten >= 0 && minuten <= 59) && (sekunden >= 0 && stunden <= 59)) {
                System.out.println("Ihre Uhrzeit ist korrekt und lautet: " + stunden + ":" + minuten + ":" + sekunden);
                uhrzeitIsCorrect = false;
            } else {
                System.out.println("Ihre Uhrzeit ist nicht korrekt. Wiederholen Sie Ihre Eingaben: ");
                System.out.println("Geben Sie bitte die Stunden an: ");
                stunden = scan.nextInt();
                System.out.println("Geben Sie bitte die Minuten an: ");
                minuten = scan.nextInt();
                System.out.println("Geben Sie bitte die Sekunden an: ");
                sekunden = scan.nextInt();
            }
            scan.close();
        }
    }
}