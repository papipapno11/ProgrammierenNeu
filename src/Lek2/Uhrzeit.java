package Lek2;

public class Uhrzeit {
    public static void main(String[] args) {

        int stunden = 14;
        int minuten = 30;
        int sekunden = 0;

        int sekundenProTag = 86400;

        // a) Sekunden seit Mitternacht
        int sekundenSeitMitternacht = (minuten * 60) + (stunden * 3600);
        System.out.println("Sekunden seit Mitternacht: " + sekundenSeitMitternacht);

        // b) Verbleibende Sekunden
        int verbleibendeSekunden = (3600 * 24) - sekundenSeitMitternacht;
        System.out.println("Verbleibende Sekunden für diesen Tag: " + verbleibendeSekunden);

        // c) wie viel Prozent des Tages schon vergangen
        double prozent = (sekundenSeitMitternacht * 100.0) / sekundenProTag;
        System.out.println("wie viel Prozent des Tages sind schon vergangen?: " + prozent);

    }
}