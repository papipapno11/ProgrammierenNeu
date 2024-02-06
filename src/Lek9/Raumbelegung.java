package Lek9;

public class Raumbelegung {
    private String kennung;
    private int maxStudierende;
    private boolean isBelegt;


    public String getKennung() {
        return kennung;
    }
    public int getMaxStudierende() {
        return maxStudierende;
    }
    public boolean getIsBelegt() {
        return isBelegt;
    }
    public void isBelegt(boolean isBelegt) {
        this.isBelegt = isBelegt;
    }


    public Raumbelegung(String kennung, int maxStudierende, boolean isBelegt) {
        this.kennung = kennung;
        this.maxStudierende = maxStudierende;
        this.isBelegt = isBelegt;
    }


    public static void abfrageBelegung(Raumbelegung[] raum) {

        for (int i = 0; i < raum.length; i++) {
            boolean isBelegt = raum[i].getIsBelegt();
            if (isBelegt) {
                System.out.println("Der Raum " + raum[i].getKennung() + " ist belegt!");
            }
            else if (!isBelegt) {
                System.out.println("Der Raum " + raum[i].getKennung() + " ist frei!");
            }
        }
    }


    public static void main(String[] args) {

        Raumbelegung[] raum = new Raumbelegung[2];

        raum[0] = new Raumbelegung("I.2.1", 25, false);
        raum[1] = new Raumbelegung("I.2.15", 40, true);

        abfrageBelegung(raum);

        raum[0].isBelegt(true);

        System.out.println("\nRaumbelegung nachdem I.2.1 belegt wurde: ");
        abfrageBelegung(raum);
    }
}