package Lek10.Weltuhr;

public class Weltzeit {
    public static Uhr[] setWeltzeit(Uhr[] weltzeit) {

        for(int i = 0; i < weltzeit.length; i++) {
            weltzeit[i] = new Uhr(i, 0, 59);
            if(weltzeit[0].getStd() == 12 && weltzeit[0].getMin() == 0 && weltzeit[0].getSek() == 0) {
                System.out.println("Überprüfen Sie die übergebene Uhrzeit! Die Uhr wurde standardmässig auf 12:00:00 Uhr gesetzt!");
                for(i = 0; i < weltzeit.length; i++) {
                    weltzeit[i] = new Uhr(i, 0, 0);
                }
            }
        }
        return weltzeit;
    }

    public static Uhr[] setSekundenPlusEins(Uhr[] weltzeit) {
        for(int i = 0; i < weltzeit.length; i++) {
            weltzeit[i].naechsteSek();
        }
        return weltzeit;
    }

    public static void ausgabeWeltzeit(Uhr[] weltzeit) {
        for(int i = 0; i < weltzeit.length; i++) {
            System.out.println(i+1 + ". Uhr:\t" + weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":"+ weltzeit[i].getSek() + " Uhr");
        }
    }


    public static void main(String[] args) {

        Uhr[] weltzeit = new Uhr[24];

        setWeltzeit(weltzeit);
        ausgabeWeltzeit(weltzeit);
        setSekundenPlusEins(weltzeit);
        System.out.println("\n\nNun ist eine Sekunde vergangen!\n");
        ausgabeWeltzeit(weltzeit);

        System.out.println("Uhrzeit mit Setter setzen: ");
        weltzeit[0].setUhr(13, 70, 0);
        weltzeit[1].setUhr(25, 10, 30);
        weltzeit[2].setUhr(2, 10, 80);
        weltzeit[3].setUhr(22, 22, 22);
    }
}