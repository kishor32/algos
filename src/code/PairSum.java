package code;

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    static Map<Integer, Integer> map=new HashMap<>();

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 6};

        getPairs(array, 6);
    }


    public static void getPairs(int [] array, int givenNumber){

        for(int a : array) {
            int value = givenNumber - a;
            if (!map.containsKey(value)) {
                map.put(a, 1);
            } else {
                System.out.println(a + "+" + value +"="+givenNumber);
            }

        }
    }
}
