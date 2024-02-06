package Lek1;

public class Tausch {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println(x);
        System.out.println(y);

        //Tausch
        int temp = x; // 5
        x = y;
        y = temp;

        //Nach dem Tausch
        System.out.println(x);
        System.out.println(y);
    }
}