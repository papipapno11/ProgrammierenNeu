package Lek10.Raumbelegung;

public class Raum {
    private String kennung;
    private int maxPlaetze;
    private int freiePlaetze;
    private int belegtePlaetze;
    private boolean belegt;
    private Student[] studentenImRaum; // ein Array von Studenten; anfangs leer

    // Getter
    public String getKennung() {
        return this.kennung;
    }

    public int getMaxPlaetze() {
        return this.maxPlaetze;
    }

    public int getFreiePlaetze() {
        this.freiePlaetze = maxPlaetze - belegtePlaetze;
        return freiePlaetze;
    }

    public int getBelegtePlaetze() {
        return this.belegtePlaetze;
    }

    public boolean isBelegt() {
        if((maxPlaetze - belegtePlaetze) == 0) {
            System.out.println("Der Raum: " + kennung + " ist leider schon voll!");
            return this.belegt = true;
        }
        else {
            System.out.println("Der Raum: " + kennung + " hat noch freie Plätze!");
            return this.belegt = false;
        }
    }

    public Student[] getStudentenImRaum() {
        return this.studentenImRaum;
    }

    // Methode betreteRaum
    public void betreteRaum(Student student) {
        boolean verfuegbar = false;
        for(int i = 0; i < this.studentenImRaum.length; i++) {
            if(studentenImRaum[i] == null) { // wenn Platz im Index noch nicht belegt wurde
                studentenImRaum[i] = student; // Studenten hier speichern
                System.out.println(student.getMatrNr() + " betritt den Raum " + getKennung());
                verfuegbar = true; // true, da Student eingetreten ist
                break;
            }
        }
        if(!verfuegbar) { // wenn kein Platz verfügbar war
            System.out.println("Der Raum ist leider schon voll! Der Student: " + student.getMatrNr() + " kann nicht beitreten!");
        }
    }

    // Methode verlasseRaum
    public void verlasseRaum(Student student) {
        boolean gefunden = false;
        for (int i = 0; i < this.studentenImRaum.length; i++) {
            if (studentenImRaum[i] == null) {
                // statt "continue" wird hier nichts gemacht, und die Schleife wird fortgesetzt
            }
            else if (student.getMatrNr() == studentenImRaum[i].getMatrNr() && student != null) {
                studentenImRaum[i] = null;
                gefunden = true;
                break;
            }
        }
        if(gefunden == true) {
            System.out.println("Der Student " + student.getMatrNr() + " verlässt den Raum!");
        }
        else {
            System.out.println("Der Student " + student.getMatrNr() + " war nicht im Raum!");
        }
    }

    // Konstruktor
    public Raum(String kennung, int maxPlaetze) {
        this.kennung = kennung;
        this.maxPlaetze = maxPlaetze;
        this.freiePlaetze = maxPlaetze;
        this.belegtePlaetze = 0;
        this.belegt = false;
        this.studentenImRaum = new Student[maxPlaetze];
    }
}