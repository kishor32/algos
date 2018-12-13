package code.otherAlgos;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubSequence {

    public static void main(String[] args) {

        String A = "ABCD";
        String B = "BGFDD";
        System.out.println(LongestCommonSubSequence.lcs(A, B));

        System.out.println(LongestCommonSubSequence.lcs(A, B).length());
    }

    private static String lcs(String a, String b) {

        StringBuilder temp = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : b.toCharArray()) {

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }


        for (char c : a.toCharArray()) {

            if (map.containsKey(c)) {

                int count = map.get(c);

                if (count > 1) {
                    for (int i = 0; i < count; i++) {
                        temp.append(c);
                    }
                } else {
                    temp.append(c);
                }
            }

        }

        return temp.toString();
    }
}
