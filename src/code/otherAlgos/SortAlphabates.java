package code.otherAlgos;

import java.util.Collections;
import java.util.LinkedList;

public class SortAlphabates {

    public static void main(String[] args) {

        String inputString = "kishor";

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < inputString.length(); i++) {
            list.add(inputString.charAt(i));
        }

        Collections.sort(list);

       for(Character c: list){
           System.out.print(c.charValue());
       }

    }
}
