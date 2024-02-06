package Lek6.skript;

public class MethodeVorzeichen2 {
    public static double absoluteValue(double x) {
        if (x < 0) return -x;
        else return x;
    }

    public static void main(String[] args) {
        System.out.println(absoluteValue(-5));
        System.out.println(absoluteValue(5));
        System.out.println(absoluteValue(0));
    }
}