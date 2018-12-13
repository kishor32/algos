package code.otherAlgos;

public class GCD {

    public static void main(String[] args){
        System.out.println(gcd(3,9));
    }

    static int gcd(int no1, int no2){

        if(no2==0){
            return no1;
        }
        return gcd(no2, no1%no2);
    }
}
