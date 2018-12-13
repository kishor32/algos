package code.otherAlgos;


// Strings are anagrams of each other

import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(Anagram.isAnagram("%^%^^", "(**&&"));
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty() || isNull(s1) || isNull(s2)) {
            return false;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] array = s1.toCharArray();

        for (char a : array) {

            if (map.containsKey(a)) {

                int count = map.get(a);
                map.put(a, count + 1);
            } else {
                map.put(a, 1);
            }
        }

        for (char a : s2.toCharArray()) {
            if (!map.containsKey(a)) {
                return false;
            } else {
                map.remove(a);
            }
        }

        return map.isEmpty();
    }

    private static boolean isNull(Object s) {
        return s != null;
    }
}
