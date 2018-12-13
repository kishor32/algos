package code.otherAlgos;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharInString {

    public static void main(String[] args) {

        System.out.println(DuplicateCharInString.isDuplicateExist("KIISHOR"));
    }

    private static boolean isDuplicateExist(String s1) {

        char[] array = s1.toCharArray();

        Set<Character> allchars = new LinkedHashSet<>();

        for (char a : array) {
            if (!allchars.add(a)) {
                System.out.println("Duplicate char is :-->"+a);
                return true;
            }else {
                allchars.add(a);
            }
        }
        return false;
    }
}
