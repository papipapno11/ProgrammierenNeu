package WSF.UEB2;

public class Gluecksspiel {
    public static void main(String[] args) {

        double zufall = Math.random(); // 0,00 bis 0,99999

        if (zufall <= 0.39) {
            System.out.println("GEWONNEN!!!");
        }
        else {
            System.out.println("VERLOREN");
        }
    }
}