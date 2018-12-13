package code.otherAlgos;

public class ReverseArrayInPlace {

    public static void main(String[] args) {

        int[] array = {2, 3, 4};

        ReverseArrayInPlace.reverse_a_sentence("kishor is a software engineer ");
    }

    private static void reverse(Object[] array) {

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverse(String test) {

        char[] array = test.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(array));
    }

    private static void reverse_a_sentence(String test) {

        String[] array = test.split(" ");
        reverse(array);
        for (String a : array) {
            reverse(a);
        }
    }
}
