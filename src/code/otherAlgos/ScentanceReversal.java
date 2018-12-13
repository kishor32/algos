package code.otherAlgos;

import java.util.Arrays;

public class ScentanceReversal {

    public static void main(String[] args) {

        String s = "my name is kishor";
        String[] aString = s.split(" ");
        StringBuilder builder=new StringBuilder();

        for (String object : aString) {
            builder.append(reverseWord2(object)).append(" ");
        }

        System.out.println(builder);
    }

    private static String reverseWord2(String word) {

        char[] arr = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            arr[i] = word.charAt(i);
            i++;
        }
        char temp;
        int l = arr.length;
        int c = 0;
        while (c < l) {
            temp = arr[l - 1];
            arr[l - 1] = arr[c];
            arr[c] = temp;
            c++;
            l--;
        }
        return new String(arr);
    }
}
