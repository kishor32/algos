package code.otherAlgos;

import java.util.*;

public class CountRepeteadCharsInAString {

    public static void main(String[] args) {

        String s = "LLLLLAAA";

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] array = s.toCharArray();

        for (char c : array) {

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
