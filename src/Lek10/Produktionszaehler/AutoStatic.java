package Lek10.Produktionszaehler;

public class AutoStatic {
    private String marke, modell, farbe;
    private int hubraum, leistungPS, preis, baujahr;
    private static int anzAuto = 0;


    public String getMarke() {
        return this.marke;
    }
    public String getModell() {
        return this.modell;
    }
    public String getFarbe() {
        return this.farbe;
    }
    public int getHubraum() {
        return this.hubraum;
    }
    public int getLeistungPS() {
        return this.leistungPS;
    }
    public int getPreis() {
        return this.preis;
    }
    public int getBaujahr() {
        return this.baujahr;
    }
    public static int getAnzAuto() {
        return anzAuto;
    }

    public void setHubraum(int ccm) {
        if (ccm > 0) {
            this.hubraum = ccm;
        }
    }

    // Konstruktor
    public AutoStatic(String marke, String modell, String farbe, int hubraum, int leistungPS, int preis, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.leistungPS = leistungPS;
        this.preis = preis;
        this.baujahr = baujahr;

        if (hubraum > 0) {
            this.hubraum = hubraum;
        }
        else {
            this.hubraum = 1600;
        }

        anzAuto++;
    }
}