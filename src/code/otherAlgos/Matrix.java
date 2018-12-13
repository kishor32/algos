package code.otherAlgos;

public class Matrix {

    public static void main(String[] args) {

        int[][] array = {

                {1, 3, 4, 5},
                {4, 5, 6, 8},
        };
        matrix(array);
    }

    private static void matrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[j][i];
            }
        }
        for (int a[] : array) {
            for (int a1 : a) {
                System.out.println(a1);
            }
        }
    }
}
