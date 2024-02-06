package WSF.UEB1;

import java.util.Scanner;

public class Cowsay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den Text ein: ");
        String text = scan.nextLine();

        System.out.println("_____________");
        System.out.println("< " + text + " >");
        System.out.println(" -------------");
        System.out.println("       \\   ^__^");
        System.out.println("        \\  (oo)\\_______");
        System.out.println("           (__)\\       )\\/\\");
        System.out.println("               ||----w |");
        System.out.println("               ||     ||");

        scan.close();
    }
}