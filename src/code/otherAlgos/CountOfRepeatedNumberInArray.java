package code.otherAlgos;

import java.util.HashMap;
import java.util.Map;

public class CountOfRepeatedNumberInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 3, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int a : array) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        for( Map.Entry<Integer,Integer>  entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println("duplicate-->"+entry.getKey());
            }
        }
    }
}
