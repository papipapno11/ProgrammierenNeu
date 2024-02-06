package WSF.UEB2;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        double kontostand = 136.34;
        System.out.println("Ihr Guthaben beträgt " + kontostand + " Euro.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Wie viel Geld wollen Sie abheben?");
        int abhebung = scan.nextInt();

        boolean isCorrect = true;

        while (isCorrect) {
            if (abhebung < kontostand) {
                kontostand -= abhebung;
                System.out.println("Es werden " + abhebung + " Euro ausgezahlt.");
                isCorrect = false;
                System.out.println("Ihr Restguthaben lautet " + kontostand + " Euro.");
            } else {
                System.out.println("Keine Auszahlung! Dieser Betrag übersteigt Ihr Guthaben.");
                System.out.print("Wie viel Geld wollen Sie abheben?");
                abhebung = scan.nextInt();
            }
        }
        scan.close();
    }
}