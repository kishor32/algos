package code.otherAlgos;

import java.util.HashMap;
import java.util.Map;

public class WordDistance {

    private static int getDistance(String[] string, String word1, String word2) {

        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < string.length; i++) {
            words.put(string[i], i);
        }

        int index1 = words.get(word1);
        int index2 = words.get(word2);

        return Math.abs(index1 - index2);
    }


    public static void main(String[] args) {

        String[] a = {"practice", "makes", "perfect", "coding", "makes"};
        int distance = WordDistance.getDistance(a, "makes", "practice");
        System.out.println("Distance is-:"+distance);
    }
}
