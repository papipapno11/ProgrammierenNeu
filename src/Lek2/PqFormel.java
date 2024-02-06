package Lek2;

public class PqFormel {
    public static void main(String[] args) {

        int p = 3;
        int q = 2;

        double vorWurzel = -(p / 2.0);

        double x1 = vorWurzel + Math.sqrt(Math.pow((p / 2.0), 2) - q);
        double x2 = vorWurzel - Math.sqrt(Math.pow((p / 2.0), 2) - q);

        System.out.println("Das Ergebnis für x1 lautet: " + x1);
        System.out.println("Das Ergebnis für x2 lautet: " + x2);
    }
}