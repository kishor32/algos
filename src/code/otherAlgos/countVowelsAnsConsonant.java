package code.otherAlgos;

import java.util.ArrayList;
import java.util.List;

public class countVowelsAnsConsonant {

    private static int countVowel = 0;

    private static int countConsonant = 0;

    private static List<Character> vowels = new ArrayList<>();

    public static void main(String[] args) {
        setVowle();
        count("kishor");
        System.out.println("Count of vowel:--"+countVowel);
        System.out.println("Count of consonant:--"+countConsonant);
    }

    private static void count(String s1) {

        char[] array = s1.toCharArray();
        for (char c : array) {
            if (getVowel(c)) {
                countVowel++;
            } else {
                countConsonant++;
            }
        }
    }

    private static void setVowle() {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    private static boolean getVowel(char c) {
        return vowels.contains(c);
    }


}


