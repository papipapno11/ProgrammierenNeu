package WSF.UEB2;

import java.util.Scanner;

public class Gluecksspiel2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tipp Spieler 1: ");
        int spieler1 = scan.nextInt();
        System.out.println("Tipp Spieler 2: ");
        int spieler2 = scan.nextInt();

        int zufall = (int) (Math.random() * 100 + 1);
        System.out.println("Zufallszahl: " + zufall);

        if (Math.abs(spieler1 - zufall) < Math.abs(spieler2 - zufall)) {
            System.out.println("Spieler 1 hat gewonnen.");
        }
        else if (Math.abs(spieler1 - zufall) > Math.abs(spieler2 - zufall)) {
            System.out.println("Spieler 2 hat gewonnen.");
        }
        else {
            System.out.println("Unentschieden!!");
        }
        scan.close();
    }
}