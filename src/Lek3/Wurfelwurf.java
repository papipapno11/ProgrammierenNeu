package Lek3;

public class Wurfelwurf {
    public static void main(String[] args) {

        int zufall = (int) (Math.random() * 6 + 1);

        if (zufall == 1) {
            System.out.println("Eins gewürfelt");
        }
        else if (zufall == 2) {
            System.out.println("Zwei gewürfelt");
        }
        else if (zufall == 3) {
            System.out.println("Drei gewürfelt");
        }
        else if (zufall == 4) {
            System.out.println("Vier gewürfelt");
        }
        else if (zufall == 5) {
            System.out.println("Fünf gewürfelt");
        }
        else if (zufall == 6) {
            System.out.println("Sechs gewürfelt");
        }
    }
}