package code.otherAlgos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSun {

    public static void main(String[] a) {

          int arr[] = {2, 7, 9, 11};
       // System.out.println(Arrays.toString(twoSun.twoSumBf(arr, 9)));
        System.out.println(twoSun.twoSum(arr, 90));
    }

    // O(n)
    public static boolean twoSum(int nums[], int target) {

        Map<Integer, Integer> map = new HashMap<>(); // key: number, value: index of the number in array
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            Integer other = map.get(target - val); // check if we have another number needed for sum in the map already
            if (other != null) {
                return true;
            } else {
                map.put(val, i);
            }
        }
        return false;
    }

    //O(n^2)
    private static int[] twoSumBf(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int maxDivisible(int a, int b) {
        while (a % b == 0) {
            a = a / b;
        }
        return a;
    }

}
