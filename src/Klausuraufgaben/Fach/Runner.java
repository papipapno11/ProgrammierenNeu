package Klausuraufgaben.Fach;

public class Runner {
    public static void main(String[] args) {

        Faecher[] fach = new Faecher[80];

        for (int i = 0; i < fach.length; i++) {
            fach[i] = new Faecher(i + 1);
        }

        // isOffen() == false
        for (int wiederholung = 0; wiederholung < 80; wiederholung++) { // Durchläufe
            for (int i = 1; i < 81; i++) { // 80 Tür-Iterationen
                if (i % (wiederholung + 1) == 0) { // jede 2., 3., etc. Tür lässt sich durch Modulo realisieren
                    fach[i - 1].setOffen(!fach[i - 1].isOffen()); // wechselt den Zustand durch set
                }
                System.out.print(fach[i - 1]);
            }
            System.out.println();
        }

        int anzahl = 0;
        for (int i = 0; i < fach.length; i++) {
            if (fach[i].isOffen()) {
                anzahl++;
            }
        }

        System.out.println("Anzahl offene Türen: " + anzahl);
    }
}