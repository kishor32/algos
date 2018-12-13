package code.otherAlgos;

import java.util.Arrays;

public class LeftRotateArray {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        int distance = 3;

        LeftRotateArray.rotate(a, distance);
    }

    private static void rotate(int[] array, int distance) {

        int length = array.length - 1;
        int i = 0;
        while (i < distance) {
            int temp = array[0];
            System.arraycopy(array, 1, array, 0, length);
            array[length] = temp;
            i++;
        }

        System.out.println(Arrays.toString(array));
    }

}
