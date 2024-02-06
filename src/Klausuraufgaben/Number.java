package Klausuraufgaben;
import java.util.Scanner;

public class Number {
    public static int isNumber(){

        Scanner scan;
        boolean flag = false;
        int zahl = -1;

        while(!flag) {

            System.out.println("Bitte Zahl eingeben:");
            scan = new Scanner(System.in);
            String eingabe = scan.nextLine();

            flag = true; // nach Eingabe gehen wir davon aus, dass es passt
            char[] charArray = eingabe.toCharArray();
            for(int i = 0; i < charArray.length; i++){
                if(charArray[i] < '0' || charArray[i] > '9'){
                    flag = false; // passt doch nicht
                    System.out.println("Bitte wiederholen Sie die Eingabe!");
                    break;
                }
            }

            if(flag){
                // nur bei true betreten
                zahl = Integer.valueOf(eingabe);
            }
        }

        return zahl;
    }

    public static void main(String[] args){

        int ergebnis = isNumber();
        System.out.println("Ergebnis: " + ergebnis);
    }
}