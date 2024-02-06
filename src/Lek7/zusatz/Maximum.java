package Lek7.zusatz;

public class Maximum {
    public static int findMaximum (int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] array = {42, 3, 120, -57, 740, 13, 9, 230, 2};

        int result = findMaximum(array);
        System.out.println(result);
    }
}