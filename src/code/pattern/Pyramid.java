package code.pattern;

public class Pyramid {

    public static void main(String[] args) {


        Pyramid.printPyramid();

        System.out.println("---------------------------");

        Pyramid.printPyramidReverse();

        System.out.println("---------------------------");

        Pyramid.printTriangle();

        System.out.println("---------------------------");

        Pyramid.pascal();

        System.out.println("---------------------------");

        Pyramid.numberPattern();

        System.out.println("---------------------------");

        Pyramid.numberPattern1();
        System.out.println("---------------------------");

        Pyramid.printTriangleAbove();
    }

    private static void printPyramid() {

        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //After 180 degree rotation
    private static void printPyramidReverse() {

        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void printTriangle() {

        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = (row - i); j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void numberPattern() {

        int row = 5;
        int num = 1;
        for (int i = 0; i < row; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    private static void numberPattern1() {
        int row = 5;
        int num;
        for (int i = 0; i < row; i++) {
            num = 1;
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }


    private static void pascal() {
        int row = 5;
        int num;
        for (int i = 0; i < row; i++) {
            num = 1;
            System.out.printf("%" + (row - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

//    Input : n = 4
//    Output :
//            1
//            3*2
//            4*5*6
//            10*9*8*7


    private static void printTriangleAbove() {
        int j, k = 0;

        // loop to decide the row number
        for (int i = 1; i <5; i++) {

            // if row number is odd
            if (i % 2 != 0) {

                // print numbers with the '*'
                // sign in increasing order
                for (j = k + 1; j < k + i; j++)
                    System.out.print(j + "*");
                System.out.println(j++);

                // update value of 'k'
                k = j;
            }

            else {

                // update value of 'k'
                k = k + i - 1;

                // print numbers with the '*' in
                // decreasing order
                for (j = k; j > k - i + 1; j--)
                    System.out.print(j + "*");
                System.out.println(j);
            }
        }
    }
}
