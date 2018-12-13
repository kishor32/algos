package code.otherAlgos;

// print all permutations of a given string

import java.util.HashSet;
import java.util.Set;

public class Permutations {

    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {

         int gdpr=0;
         int cid=1;

         boolean t=true;

         if(cid==2 || gdpr==0 && t){

             System.out.println("ok");
         }else {
             System.out.println("not ok");
         }
//        String[] a = {"tpe", "ept", "etos"};
//
//        String string = "tpe";
//        int left = 0;
//        int right = string.length() - 1;
//
//        for (String s : Permutations.get(string, left, right)) {
//                System.out.println(s);
//        }
    }

    private static Set<String> get(String abc, int left, int right) {
        String temp;
        for (int i = 0; i <=right; i++) {
            if (left == right) {
                break;
            } else {
                abc = swap(abc, left, i);
                get(abc, left + 1, right);
                abc = swap(abc, left, i);
            }
            set.add(abc);
        }
        return set;
    }

    private static String swap(String string, int i, int j) {
        char temp;
        char[] arr = string.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
