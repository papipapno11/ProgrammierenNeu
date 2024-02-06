package Klausuraufgaben.Bestellprozess;

public class Bestellung {

    private int bestellnummer;
    private Artikel[] artikel;

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        this.artikel = new Artikel[50]; // maximal 50 Artikel; Speicher für 50 reserviert
    }

    public Artikel[] getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel[] artikel) {
        if (artikel.length <= 50) {
            this.artikel = artikel;
        }
        else {
            System.out.println("Das übergebene Array enthält zu viele Artikel!");
        }
    }

    public void einfuegen(Artikel neuerArtikel) {
        for (int i = 0; i < artikel.length; i++) {
            if (artikel[i] == null) { // hier ist noch nichts angelegt
                artikel[i] = neuerArtikel;
                break;
            }
        }
    }

    public void loeschen(int artikelnummer) {
        // Code zum Löschen eines Artikels
    }
}