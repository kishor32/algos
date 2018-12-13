package code.otherAlgos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllPermutations {

    public static void main(String[] args) {


        String str = "BANANAS";

        Set<Character> set = new LinkedHashSet<>();

        StringBuilder builder=new StringBuilder();

        char[] array = str.toCharArray();
        for (char a : array) {
            set.add(a);
        }

        for (Character aSet : set) {
            builder.append(aSet);
        }

        System.out.println(builder.toString());
    }

    private static void permutations(String s1) {


    }
}
