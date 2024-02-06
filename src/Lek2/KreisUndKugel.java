package Lek2;

public class KreisUndKugel {
    public static void main(String[] args) {

        double radius = 3.7;

        double kreisflaeche = Math.PI * Math.pow(radius, 2);
        double kreisumfang = 2 * Math.PI * radius;

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Die Kreisfläche lautet: " + kreisflaeche);
        System.out.println("Der Kreisumfang lautet: " + kreisumfang);
        System.out.println("Das Volumen der Kugel lautet: " + volumen);
    }
}