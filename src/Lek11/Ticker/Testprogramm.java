package Lek11.Ticker;

public class Testprogramm {
    public static void main(String[] args) {

        Ticker ticker1 = new Ticker(45);
        Ticker ticker2 = new Ticker(40);
        Ticker ticker3 = new Ticker(75);
        Ticker ticker4 = new Ticker();
        Ticker ticker5 = new Ticker(-30);

        char[] news = "Wettervorhersage: Schnee in Wuerzburg".toCharArray();

        ticker1.setNachricht(news);
        ticker2.setNachricht(news);
        ticker3.setNachricht(news);
        ticker4.setNachricht(news);
        ticker5.setNachricht(news);

        System.out.println("Ticker 1: " + ticker1.getNachricht() + "\tTicker1 Groesse: " + ticker1.getGroesse());
        System.out.println("Ticker 2: " + ticker2.getNachricht() + "\tTicker1 Groesse: " + ticker2.getGroesse());
        System.out.println("Ticker 3: " + ticker3.getNachricht() + "\tTicker1 Groesse: " + ticker3.getGroesse());
        System.out.println("Ticker 4: " + ticker4.getNachricht() + "\tTicker1 Groesse: " + ticker4.getGroesse());
        System.out.println("Ticker 5: " + ticker5.getNachricht() + "\tTicker1 Groesse: " + ticker5.getGroesse());

        System.out.println("\nDie Nachrichten werden nun rotiert!");
        ticker1.rotateNachricht(14);
        ticker2.rotateNachricht(37);
        ticker3.rotateNachricht(56);
        ticker4.rotateNachricht(37);
        ticker5.rotateNachricht(100)
        ;
        System.out.println("Ticker 1 um 14 rotiert:\n" + ticker1.getNachricht());
        System.out.println("Ticker 2 um 37 rotiert:\n" + ticker2.getNachricht());
        System.out.println("Ticker 3 um 56 rotiert:\n" + ticker3.getNachricht());
        System.out.println("Ticker 4 um 37 rotiert:\n" + ticker4.getNachricht());
        System.out.println("Ticker 5 um 100 rotiert:\n" + ticker5.getNachricht());
    }
}