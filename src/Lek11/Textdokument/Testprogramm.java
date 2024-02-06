package Lek11.Textdokument;

public class Testprogramm {
    public static void main(String[] args) {

        String z1 = "Roses are red";
        String z2 = "Violets are Blue";
        String z3 = "Rosen sind rot";
        String z4 = "Veilchen sind blau";

        String z5 = "+++Das ist ein eingefügter Text+++";

        char[][] textdoc1 = { z1.toCharArray(), z2.toCharArray(), z3.toCharArray(), z4.toCharArray() };

        Textdokument text = new Textdokument(textdoc1);

        System.out.println("Originaler Text:\n" + text.getTextdokument());

        text.vertauscheZeilen(1, 4);
        System.out.println("\nVertauschter Text:\n" + text.getTextdokument());

        char[][] einfuegeText = {z5.toCharArray()};
        text.fuegeEinTextdokument(einfuegeText, 1);
        System.out.println("\nText mit eingefügtem Text:\n" + text.getTextdokument());

        System.out.println("Der Text hat nun so viele Zeichen: " + text.zaehleZeichen());
    }
}