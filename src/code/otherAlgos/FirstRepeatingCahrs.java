package code.otherAlgos;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCahrs {

    private static void firstRepeatingChar(String s) {

        int length = s.length();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if(!set.add(s.charAt(i))){
                System.out.println("First repeating character--"+s.charAt(i));
                break;
            }
        }
    }

    public static void main(String[]a){
        FirstRepeatingCahrs.firstRepeatingChar("addsss");
    }
}
