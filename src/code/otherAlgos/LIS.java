package code.otherAlgos;

import java.util.Arrays;

public class LIS {

    public static void main(String[] args) {

        int[] array = {3, 10, 2, 1, 20};
        int i, j;

        int[] lis = new int[array.length];

        for (i = 0; i < array.length; i++) {
            lis[i] = 1;
        }
        System.out.println("lis values"+Arrays.toString(lis));

        for (i = 0; i < array.length; i++) {

            for (j = 0; j < i ; j++) {

                if (array[i] < array[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }

            }
        }

        for (i = 0; i < array.length; i++) {
            if(lis[i]==1){
                System.out.println(Arrays.toString(new int[]{array[i]}));
            }
        }
    }
}
