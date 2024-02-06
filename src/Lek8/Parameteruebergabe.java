package Lek8;

public class Parameteruebergabe {

    public static void main(String[] args) throws Exception {

        // Eingabe der Zahlen über Modify Run Configurations
        if (args.length == 2) {
            int zahlEins = Integer.valueOf(args[0]);
            int zahlZwei = Integer.valueOf(args[1]);

            int ergebnis = zahlEins * zahlZwei;

            System.out.println("Es wurden zwei Werte übergeben!");
            System.out.println("Das Ergebnis von " + zahlEins + " * " + zahlZwei + " = " + ergebnis);
        }
        else {
            throw new Exception("Anzahl der Parameter ungültig!");
        }
    }
}