package code.otherAlgos;

import java.util.HashMap;
import java.util.Map;

public class DP_0_1knapsack {

    public static void main(String[] args) {

        int[] value = {10, 30, 40};
        int[] weight = {2, 4, 5};
        int W = 6;

        Map<Integer, Integer> store = new HashMap<>();
        for (int aValue : value) {
            for (int aWeight : weight) {
                store.put(aValue, aWeight);
            }
        }

        System.out.println(store);
    }
}
