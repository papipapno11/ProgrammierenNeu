package Lek9.AutoAttr;
public class Auto2 { // Hauptklasse, die Autos repräsentiert

    // Instanzvariablen/ Eigenschaften
    private String marke;
    private String modell;
    private int hubraum;
    private String farbe;
    private int leistungInPS;
    private double preis;

    // Konstruktor; initialisiert die Eigenschaften des Autos
    Auto2(String marke, String modell, int hubraum, String farbe, int leistungPS, double preis) {

        // Zuweisung
        this.marke = marke; // um auf die Instanzvariable der Klasse zuzugreifen
        this.modell = modell;
        this.farbe = farbe;
        this.leistungInPS = leistungPS;
        this.preis = preis;

        if (hubraum > 0) {
            this.hubraum = hubraum;
        }
        else {
            this.hubraum = 1600;
        }
    }

    // Setter für Hubraum; sicherstellen, dass der Hubraum nur bei dieser Bedingung gesetzt wird
    public void setHubraum (int ccm) {
        if (ccm > 0) {
            this.hubraum = ccm; // "take the cars-object and set its marke to the name variable being passed in"
        }
    }

    // Getter-Methoden für jede Instanzvariable, um deren Werte abzurufen
    public String getMarke() {
        return marke;
    }
    public String getModell() {
        return modell;
    }
    public int getHubraum() {
        return hubraum;
    }
    public String getFarbe() {
        return farbe;
    }
    public int getLeistungPS() {
        return leistungInPS;
    }
    public double getPreis() {
        return preis;
    }
}