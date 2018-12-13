package code;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] array = {1,2,4,5};

        int total=5*(5+1)/2;

        int arraySum=0;
        for(int a: array){
            arraySum+=a;
        }

        System.out.println(total-arraySum);
    }
}
