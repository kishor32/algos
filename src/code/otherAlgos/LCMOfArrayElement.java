package code.otherAlgos;

public class LCMOfArrayElement extends GCD {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 16};

        System.out.println("LCM Of ARRAY ELEMENTS :" + lcmOfArrayElement(array, array.length));

        System.out.println("--------------------");

        System.out.println("GCD Of ARRAY ELEMENTS :" + gcdOfArrayElement(array, array.length));
    }

    private static int lcmOfArrayElement(int[] array, int length) {

        int ans = array[0];

        for (int i = 0; i < length; i++) {
            ans = ((array[i] * ans) / gcd(array[i], ans));
        }
        return ans;
    }

    private static int gcdOfArrayElement(int[] array, int length) {

        int ans = array[0];

        for (int i = 0; i < length; i++) {
            ans = gcd(array[i], ans);
        }
        return ans;
    }
}
