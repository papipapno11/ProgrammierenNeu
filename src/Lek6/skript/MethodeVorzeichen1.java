package Lek6.skript;

public class MethodeVorzeichen1 {
    public static int sign(double x) {

        if (x < 0) return -1;
        else if (x > 0) return +1;
        else return 0;
    }

    public static void main(String[] args) {
        //Betrag berechnen
        int zahl = -5;
        zahl = zahl * sign(zahl);
        System.out.println(zahl);
    }
}