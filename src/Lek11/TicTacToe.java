package Lek11;

public class TicTacToe {
    public static boolean[][][] generiereFelder() {

        boolean [][][] array = new boolean[3][3][3]; // [Feld][Zeile][Spalte]

        for (int i = 0; i < array.length; i++) { // Felder
            for (int j = 0; j < array[i].length; j++) { // Zeilen
                for (int k = 0; k < array[i][j].length; k++) { // Spalten bzw. einzelnes Feld
                    int random = (int) (Math.random() * 2);
                    if (random == 1) {
                        array[i][j][k] = true;
                    }
                    else {
                        array[i][j][k] = false;
                    }
                }
            }
        }

        return array;
    }

    public static void ausgabeFelder() {

        boolean[][][] filledArray = generiereFelder();

        for(int i = 0; i < filledArray.length; i++) { // Felder
            System.out.println((i+1) + ". Feld:");
            for(int j = 0; j < filledArray[i].length; j++) { // Zeilen
                for(int k = 0; k < filledArray[i][j].length; k++) { // Spalten bzw. einzelnes Feld
                    if(filledArray[i][j][k] == true) {
                        System.out.print("X  ");
                    }
                    else {
                        System.out.print("O  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        generiereFelder();
        ausgabeFelder();
    }
}