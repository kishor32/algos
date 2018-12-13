package code.otherAlgos;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] a = {4, 3, 2, 34, 89, 1, 90, 5};
        System.out.println(LongestConsecutiveSequence.getLongestConsecutiveSequence(a));
    }


    private static int getLongestConsecutiveSequence(int a[]) {

        Set<Integer> set=new HashSet<>();

        for(int nums: a){
            set.add(nums);
        }

        int lower=0;
        int upper=0;
        int max=0;

        for(int i: a){

            if(set.contains(i)){
                set.remove(i);
                lower=i-1;
                upper=i+1;

            }

            while (set.contains(lower)){
                set.remove(lower);
                lower--;
            }


            while (set.contains(upper)){
                set.remove(upper);
                upper++;
            }

            if(upper-lower-1> max){
                max=upper-lower-1;
            }

        }
        return max;
    }
}
