package Lek6.skript;

public class MethodenBeispiel2 {
    public static double absoluteValue (double x) {
        return x * sign(x);
    }
    public static int sign (double zahl) {

    if (zahl < 0) return -1;
    else if (zahl > 0) return +1;
    else return 0;
    }

    public static void main(String[] args) {
        System.out.println(absoluteValue(-5));
    }
}