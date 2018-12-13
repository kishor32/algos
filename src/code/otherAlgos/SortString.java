package code.otherAlgos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortString {

    public static void main(String[] args) {

        String s = "PALL";

        char[] array = s.toCharArray();

        List<Character> chars = new LinkedList<>();

        for (char c : array) {
            chars.add(c);
        }

        Collections.sort(chars);

        chars.forEach(System.out::println);
    }
}
