package Lek4;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 15; i++) {
            System.out.println(i);
            Thread.sleep(800);
        }
    }
}