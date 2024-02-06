package WSF.UEB1;
import java.util.Scanner;

public class Kassenbon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die erste Ware ihrer Einkaufsliste ein: ");
        String ware1 = scan.nextLine();
        System.out.println("Geben Sie die Menge zur ersten Ware ein: ");
        int menge1 = scan.nextInt();
        System.out.println("Geben Sie den Preis zur ersten Ware ein: ");
        double preis1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Geben Sie die zweite Ware ihrer Einkaufsliste ein: ");
        String ware2 = scan.nextLine();
        System.out.println("Geben Sie die Menge zur zweiten Ware ein: ");
        int menge2 = scan.nextInt();
        System.out.println("Geben Sie den Preis zur zweiten Ware ein: ");
        double preis2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Geben Sie die dritte Ware ihrer Einkaufsliste ein: ");
        String ware3 = scan.nextLine();
        System.out.println("Geben Sie die Menge zur dritten Ware ein: ");
        int menge3 = scan.nextInt();
        System.out.println("Geben Sie den Preis zur dritten Ware ein: ");
        double preis3 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Geben Sie die vierte Ware ihrer Einkaufsliste ein: ");
        String ware4 = scan.nextLine();
        System.out.println("Geben Sie die Menge zur vierten Ware ein: ");
        int menge4 = scan.nextInt();
        System.out.println("Geben Sie den Preis zur vierten Ware ein: ");
        double preis4 = scan.nextDouble();
        scan.nextLine();


        double gesamtbetrag = (menge1 * preis1) + (menge2 * preis2) + (menge3 * preis3) + (menge4 * preis4);
        System.out.println("Das macht: " + gesamtbetrag + "€");

        System.out.println("Geben Sie den Betrag zur Begleichung des Rechnungsbetrags ein: ");
        double gegeben = scan.nextDouble();
        scan.nextLine();

        double zurueck = gegeben - gesamtbetrag;

        System.out.println();
        System.out.println("Kassenbon:");
        System.out.println("----------------------------------");
        System.out.println(ware1 + "\t\t" + menge1 + " x" + "\t" + preis1 + " EUR");
        System.out.println("\t\t\t\t\t\t" + (menge1 * preis1) + " EUR");
        System.out.println(ware2 + "\t\t" + menge2 + " x" + "\t" + preis2 + " EUR");
        System.out.println("\t\t\t\t\t\t" + (menge2 * preis2) + " EUR");
        System.out.println(ware3 + "\t\t" + menge3 + " x" + "\t" + preis3 + " EUR");
        System.out.println("\t\t\t\t\t\t" + (menge3 * preis3) + " EUR");
        System.out.println(ware4 + "\t\t" + menge4 + " x" + "\t" + preis4 + " EUR");
        System.out.println("\t\t\t\t\t\t" + (menge4 * preis4) + " EUR");
        System.out.println("----------------------------------");
        System.out.println("Gesamt\t\t\t\t\t" + gesamtbetrag + " EUR");
        System.out.println("Gegeben\t\t\t\t\t" + gegeben + " EUR");
        System.out.println();
        System.out.println("Zurück\t\t\t\t\t" + zurueck + " EUR");

        scan.close();
    }
}