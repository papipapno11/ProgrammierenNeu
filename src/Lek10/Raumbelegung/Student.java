package Lek10.Raumbelegung;

public class Student {
    private String vorname;
    private String nachname;
    private int matrNr;
    private int chipNr;

    //Getter
    public String getVorname() {
        return this.vorname;
    }
    public String getNachname() {
        return this.nachname;
    }
    public int getMatrNr() {
        return this.matrNr;
    }
    public int getChipNr() {
        return this.chipNr;
    }

    //Konstruktor
    public Student(String vorname, String nachname, int matrNr, int chipNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrNr = matrNr;
        this.chipNr = chipNr;
    }
}