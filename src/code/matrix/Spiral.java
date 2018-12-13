package code.matrix;

public class Spiral {

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Spiral.printSpiral(a);
    }

    private static void print(int[][] a) {

        System.out.println(a.length);
        System.out.println(a[0].length);
    }

    public static void printSpiral(int[][] spiral) {
        int n = 3;

        spiral = new int[n][n];

        int value = 1;

        int minCol = 0;

        int maxCol = n - 1;

        int minRow = 0;

        int maxRow = n - 1;

        while (value <= n * n) {

            for (int i = minCol; i <= maxCol; i++) {

                spiral[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >=minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >=minRow+1; i--) {
                spiral[i][minCol] = value;
                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

        for (int[] aSpiral : spiral) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(aSpiral[j] + "\t");
            }

            System.out.println();
        }
    }
}
