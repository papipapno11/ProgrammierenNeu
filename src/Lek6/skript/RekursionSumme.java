package Lek6.skript;

public class RekursionSumme {
    public static int sum(int n) {

        if (n == 0) return 0;
        return n + sum(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sum(3));
    }
}