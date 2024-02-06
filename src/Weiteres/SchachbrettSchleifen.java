package Weiteres;

public class SchachbrettSchleifen {
        public static void main(String[] args) {

            char[] werte = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
            int n = 8;

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < werte.length; j++) {
                    System.out.print(werte[j] + "" + i + " ");
                    /* "" damit die Werte als Zeichenketten konkateniert werden, anstatt
                    arithmetisch addiert zu werden */
                }
                System.out.println();
            }
        }
    }