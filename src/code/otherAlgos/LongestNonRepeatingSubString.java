package code.otherAlgos;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestNonRepeatingSubString {


    private static String getLongestSubString(String input) {

        int length = input.length();
        if(length == 0 || input.equals(" ")) {
            throw new RuntimeException("invalid input");
        }

        Set<Character> storeString = new LinkedHashSet<>();
        String temp = "";
        String finalString = "";

        for (int i = 0; i < length; i++) {

            char c = input.charAt(i);
            if(c== ' '){
                throw new RuntimeException("invalid input");
            }

            if (storeString.contains(c)) {
                temp = "";
            }
            temp = temp + c;
            storeString.add(c);

            if (temp.length() > finalString.length()) {
                finalString = temp;
            }
        }
        return finalString;
    }


    public static void main(String [] array) {
            String s = LongestNonRepeatingSubString.getLongestSubString("KANKANA");
            System.out.println("String is ::" + s);
            System.out.println("Length is::" + s.length());

    }
}