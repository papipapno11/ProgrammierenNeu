package Lek2;

public class IntZuChar {
    public static void main(String[] args) {

        int a = 72;
        int b = 97;
        int c = 108;
        int d = 108;
        int e = 111;
        int f = 33;

        char c1 = (char) a;
        char c2 = (char) b;
        char c3 = (char) c;
        char c4 = (char) d;
        char c5 = (char) e;
        char c6 = (char) f;

        String s = "" + c1 + c2 + c3 + c4 + c5 + c6;
        System.out.println(s);
    }
}