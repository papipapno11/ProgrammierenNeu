package Lek6.zusatz;
import java.util.Scanner;

public class Formatierung {

    public static String formatName (String firstName, String secondName) {

        return firstName + ", " + secondName;
    }

    public static String formatNameWithMatriculationNr (String firstName, String secondName, int matriculationNr) {

        return formatName(firstName, secondName) + " (" + matriculationNr + ")";
    }

    public static String formatNameWithMatriculationNrAndMail (String firstName, String secondName, int matriculationNr, String email) {

        return formatNameWithMatriculationNr(firstName, secondName, matriculationNr) + ": " + email;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Vornamen ein: ");
        String firstName = scan.nextLine();
        System.out.println("Geben Sie bitte Ihren Nachnamen ein: ");
        String secondName = scan.nextLine();
        System.out.println("Geben Sie bitte Ihre 7-stellige Matrikelnummer ein: ");
        int matriculationNr = scan.nextInt();
        scan.nextLine();
        System.out.println("Geben Sie bitte Ihre E-Mail-Adresse ein: ");
        String email = scan.nextLine();

        String formattedName = formatName(firstName, secondName);
        System.out.println(formattedName);

        String formattedNameWithMatriculationNr = formatNameWithMatriculationNr(firstName, secondName, matriculationNr);
        System.out.println(formattedNameWithMatriculationNr);

        String formattedNameWithMatriculationNrAndMail = formatNameWithMatriculationNrAndMail(firstName, secondName, matriculationNr, email);
        System.out.println(formattedNameWithMatriculationNrAndMail);

        scan.close();
    }
}