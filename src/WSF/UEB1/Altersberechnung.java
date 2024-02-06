package WSF.UEB1;
import java.util.Scanner;

public class Altersberechnung {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hallo, wie heißt du?");
        String name = scan.nextLine();
        System.out.println("Welches Jahr haben wir, " + name + "?");
        int aktuellesJahr = scan.nextInt();
        System.out.println("In welchem Jahr bist du geboren?");
        int geburtsjahr = scan.nextInt();
        System.out.println("Hattest du dieses Jahr schon Geburtstag?");
        System.out.println("Für ja gebe 0 für nein 1 ein: ");
        int hatteGeburtstag = scan.nextInt();


        int alter = aktuellesJahr - geburtsjahr;
        if (hatteGeburtstag == 0) {
            alter = aktuellesJahr - geburtsjahr;
        }
        else {
            alter--;
        }

        System.out.println(name + ", du bist " + alter + " Jahre alt.");
        scan.close();
    }
}