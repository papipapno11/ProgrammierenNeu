package Lek8;

public class EinfacherRechner {
    public static void main(String[] args) throws Exception {

        int letzteZahl = args.length - 2; // Position letzte Zahl
        int posOperator = args.length - 1; // Position Operator

        String operator = args[posOperator]; // Umwandlung in String

        double ergebnis = 0.0;

        if (operator.equals("+")) {
            for (int i = 0; i <= letzteZahl; i++) {
                ergebnis += Double.valueOf(args[i]);
            }
        }
        else if (operator.equals("-")) {
            ergebnis = Double.valueOf(args[0]); // "ergebnis" bekommt direkt zu Beginn das erste Element zugewiesen
            for (int i = 1; i <= letzteZahl; i++) {
                ergebnis -= Double.valueOf(args[i]);
            }
        }
        else {
            throw new Exception("Ungültige Parameterübergabe! Bitte prüfen!");
        }

        System.out.println("Ergebnis: " + ergebnis);
    }
}