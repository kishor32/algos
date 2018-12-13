package code;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInIntArray {

    public static void main(String[] args) {

        int[] array = {1,2,4,4,5};

        Map<Integer,Integer> map=new HashMap<>();

        for(int a: array){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
