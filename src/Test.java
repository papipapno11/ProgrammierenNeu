
public class Test {




    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };

        int laenge = 0;
        for (int i = 0; i < arr.length; i++) {
            laenge += arr[i].length;
        }

        System.out.println(laenge);
    }
}