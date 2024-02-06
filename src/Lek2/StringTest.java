package Lek2;

public class StringTest {
    public static void main(String[] args) {

        String s = "Das ist ein neuer Test";

        s = s.replace("neuer", "langweiliger");
        s = s + "!";

        System.out.println(s);
        System.out.println("Länge: " + s.length());
    }
}