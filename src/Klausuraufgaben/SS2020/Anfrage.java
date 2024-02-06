package Klausuraufgaben.SS2020;

public class Anfrage {

    private String methode; // "GET", "POST"
    private String url;

    public Anfrage(String methode, String url) {
        if (!methode.equals("GET") && !methode.equals("POST")) {
            this.methode = "GET";
        }
        else {
            this.methode = methode;
        }
        this.url = url;
    }

    String[] headers = new String[20];

    public void addHeader(String header) {
        for (int i = 0; i < headers.length; i++) {
            if (headers[i] == null) {
                headers[i] = header;
                return;
            }
        }
    }

    @Override
    public String toString() {
        String ergebnis = "";

        ergebnis += this.methode + " " + this.url + " " + "HTTP/1.0" + "\n";
        for (int i = 0; i < headers.length; i++) {
            String a = headers[i];
            ergebnis += a + "\n";
        }

        return ergebnis;
    }

    public static void main(String[] args) {

        // Verwendung Anfrage-Klasse; IMMER NÖTIG UM FUNKTIONEN ZU NUTZEN
        Anfrage anfrage = new Anfrage("GET", "http://www.google.de/index.html");

        // Header hinzufügen
        anfrage.addHeader("Content-Type: application/json");

        // Ausgabe
        System.out.println("HTTP-Anfrage:");
        System.out.println(anfrage);
    }
}