package code.otherAlgos;


// How to program to print first non repeated character from String
//
//Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5VgAJLj41


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void main(String[] array) {
        FirstNonRepeatedChar.fnc("KISHOR");
    }

    public static void fnc(String s1) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] allChars = s1.toCharArray();

        for (char a : allChars) {
            if (map.containsKey(a)) {
                int count = map.get(a);
                map.put(a, count + 1);
            } else {
                map.put(a, 1);
            }
        }

       for(Map.Entry<Character,Integer> entry: map.entrySet()){
           if(map.get(entry.getKey())==1){
               System.out.println(entry.getKey());
               return;
           }
       }
    }
}
