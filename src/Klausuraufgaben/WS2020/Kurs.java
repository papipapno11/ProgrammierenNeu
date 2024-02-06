package Klausuraufgaben.WS2020;
import java.util.Scanner;

public class Kurs {

    private String kursart;
    private int kursdauer;
    private Mitglied[] mitglieder;
    private int maxTeilnehmer;
    private int anzahlTeilnehmer;

    public Kurs(String kursart, int kursdauer, int maxTeilnehmer) {
        this.kursart = kursart;
        this.kursdauer = kursdauer;
        this.maxTeilnehmer = maxTeilnehmer;
        this.mitglieder = new Mitglied[maxTeilnehmer];
        this.anzahlTeilnehmer = 0;
    }

    public boolean anmeldungKurs(Mitglied mitglied) {

        if (anzahlTeilnehmer < maxTeilnehmer) {
            mitglieder[anzahlTeilnehmer++] = mitglied;
            return true;
        }

        return false;
        }

    public boolean abmeldungKurs(Mitglied mitglied) {

        for (int i = 0; i < anzahlTeilnehmer; i++) {
            if (mitglieder[i].getMitgliedsnummer() == mitglied.getMitgliedsnummer()) {
                mitglieder[i] = mitglieder[anzahlTeilnehmer - 1];
                anzahlTeilnehmer--;
                return true;
            }
        }

        System.out.println("Das Mitglied mit der Mitgliedsnummer " + mitglied.getMitgliedsnummer() + "ist nicht für den Kurs angemeldet.");
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Kurs k1 = new Kurs("Karate", 60, 10);
        Kurs k2 = new Kurs("Judo", 90, 15);
        Kurs k3 = new Kurs("Boxen", 30, 20);

        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.println("Geben Sie bitte Ihre Kursart ein: ");
            String kursart = scan.nextLine();

            try {
                if (!(kursart.equals("Karate") || kursart.equals("Judo") || kursart.equals("WingChun") || kursart.equals("Boxen") || kursart.equals("KungFu"))) {
                    throw new RuntimeException("Dieser Kurs wird leider nicht angeboten!");
                } else {
                    System.out.println("Sie belegen " + kursart);
                    isCorrect = true;
                }
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        scan.close();
    }
}