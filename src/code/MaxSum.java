package code;

public class MaxSum {

    // exclude negative number

    public static void main(String[] args) {

        int[] array = {2, 6, 7, -4, 7, -1};

        int sum = 0;

        for (int a : array) {
            if(!(a<0)){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
