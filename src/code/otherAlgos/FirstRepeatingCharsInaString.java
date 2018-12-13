package code.otherAlgos;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharsInaString {

    public static void main(String[] args) {

        String s = "PALL";

        // take the count

        Set<Character> characters = new HashSet<>();

        char[] array = s.toCharArray();

        for (char c : array) {

            if (characters.contains(c)) {
                System.out.println("Repeating character is::" + c);
                return;
            } else {
                characters.add(c);
            }
        }
    }
}
