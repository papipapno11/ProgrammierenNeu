package Lek2;

public class Kosten {
    public static void main(String[] args) {

        int kaltmiete = 750;
        int nebenkosten = 211;
        int gesamtkosten = 12 * (kaltmiete + nebenkosten);
        System.out.println("Die jährlichen Gesamtkosten belaufen sich auf: " + gesamtkosten + "€");

        double nebenkostenNeu = 1.3 * nebenkosten;
        double gesamtkostenNeu = 12 * (kaltmiete + nebenkostenNeu);
        System.out.println("Die veränderten jährlichen Gesamtkosten belaufen sich auf: " + gesamtkostenNeu + "€");
    }
}