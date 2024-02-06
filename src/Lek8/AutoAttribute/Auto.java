package Lek8.AutoAttribute;

public class Auto {
    String marke;
    String modell;
    int hubraum;
    String farbe;
    int leistungInPS;
    double preis;


    Auto(String marke, String modell, int hubraum, String farbe, int leistungPS, double preis) {
        this.marke = marke; // um auf die Instanzvariable der Klasse zuzugreifen
        this.modell = modell;
        this.hubraum = hubraum;
        this.farbe = farbe;
        this.leistungInPS = leistungPS;
        this.preis = preis;
    }
}