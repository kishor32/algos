package code.otherAlgos;

import java.util.Arrays;

public class LeaderBoard {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        LeaderBoard.leaderBoard(array);
        System.out.println(Arrays.toString(array));
    }

    private static void leaderBoard(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 2)
                swap(array, 0, i - 1);
        }

    }


    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
