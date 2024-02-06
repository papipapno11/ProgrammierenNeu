package Lek10.Raumbelegung;

public class Testprogramm {
    public static void main(String[] args) {

        // Anlegen der Räume
        Raum[] raum = new Raum[4];
        raum[0] = new Raum("I.2.3", 3);
        raum[1] = new Raum("I.2.4", 4);
        raum[2] = new Raum("I.2.5", 5);
        raum[3] = new Raum("I.2.10", 10);

        // Anlegen der Studenten
        Student[] students = new Student[5];
        students[0] = new Student("Mirko", "Messinetti", 101, 100);
        students[1] = new Student("Jakob", "Gauch", 202, 200);
        students[2] = new Student("Kevin", "Brandmann", 303, 300);
        students[3] = new Student("Olaf", "Scholz", 404, 400);
        students[4] = new Student("Max", "Mustermann", 505, 500);


        // Anzeige Räume
        System.out.println("Es gibt folgende Räume:");
        for (int i = 0; i < raum.length; i++) {
            System.out.println("Raum: " + raum[i].getKennung() + "\tKapazität: " + raum[i].getMaxPlaetze() +
                    "\tFreie Plätze: " + raum[i].getFreiePlaetze() + "\tBelegte Plätze: " + raum[i].getBelegtePlaetze());
        }

        // Anzeige Studenten
        System.out.println("\nEs gibt folgende Studenten:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Vorname: " + students[i].getVorname() + "\t\tNachname: " + students[i].getNachname()
                    + "\t\tMatrNr: " + students[i].getMatrNr() + "\t\tChipNr: " + students[i].getChipNr());
        }

        // Studenten betreten den Raum
        System.out.println("\nStudenten betreten den Raum");
        raum[0].betreteRaum(students[0]);
        raum[0].betreteRaum(students[1]);
        raum[0].betreteRaum(students[2]);
        raum[0].betreteRaum(students[3]);
        raum[1].betreteRaum(students[3]);
        raum[2].betreteRaum(students[4]);
        raum[3].betreteRaum(students[4]);

        // Studenten verlassen den Raum
        System.out.println("\nStudenten verlassen den Raum");
        raum[0].verlasseRaum(students[0]);
        raum[0].verlasseRaum(students[1]);
        raum[0].verlasseRaum(students[2]);
        raum[0].verlasseRaum(students[3]);
        raum[1].verlasseRaum(students[3]);
        raum[2].verlasseRaum(students[4]);
        raum[3].verlasseRaum(students[4]);
    }
}