
package code.otherAlgos;

import java.util.LinkedList;
// Write a Comparator in Java to
// compare two employees based
// upon there name, departments and age

public class SubString {
    public static void main(String[] args) {

        System.out.println( printSubString("KISHOR", "ii"));
    }

    private static void printSubString(String str, int L, int R) {

        if (L > R || str.equals("") || str.length() == 1) {
            System.out.println("Abnormal input string found ");
            return;
        }
        int length = str.length();
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (counter != length && L <= R) {
            stringBuilder.append(str.charAt(L));
            L++;
            counter++;
        }
        System.out.println(stringBuilder);
    }

    private static boolean printSubString(String string1, String string2) {

        boolean match = false;
        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                match = string1.charAt(i) == string2.charAt(j);
            }
        }
        return match;
    }
    }
