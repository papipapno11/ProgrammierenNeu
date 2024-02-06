package Klausuraufgaben.Bestellprozess;

public class Artikel {

    private int artikelnummer;
    private String artikelname;

    public Artikel(int artikelnummer, String artikelname) {
        this.artikelnummer = artikelnummer;
        this.artikelname = artikelname;
    }

    // Getter
    public int getArtikelnummer() {
        return artikelnummer;
    }
    public String getArtikelname() {
        return artikelname;
    }

    // Setter
    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }
}