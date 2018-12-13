package code.sortings;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 1};
        BubbleSort.sort(a);
    }

    private static void sort(int[] a) {

        boolean swapped = false;
        int n = a.length - 1;
        int temp;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {

                if (a[j] > a[j + 1]) {

                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }


        for (int e : a) {
            System.out.print(e);
        }
    }
}
