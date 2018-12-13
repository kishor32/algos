package code.sortings;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {1,0};
        SelectionSort.sort(a);
    }

    private static void sort(int[] a) {

        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < a.length - 1; j++) {

                if (a[j] < a[min_index]) {
                    min_index = j;
                }
                temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
        }

        for (int e : a) {
            System.out.print(e);
        }
    }
}
