package Klausuraufgaben.Timeline;

public class Beitrag {

    // da die Instanzvariablen private sind, muss mit Getter und Setter gearbeitet werden
    private String text;
    private String absender;
    private String empfaenger;
    private Beitrag next;

    public Beitrag(String text, String absender, String empfaenger) {
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.next = null;
    }

    // Setter
    public void setNext(Beitrag next){
        this.next = next;
    }

    // Getter
    public Beitrag getNext(){
        return next;
    }
    public String getEmpfaenger(){
        return empfaenger;
    }
    public String getAbsender(){
        return absender;
    }
    public String getText(){
        return text;
    }
}