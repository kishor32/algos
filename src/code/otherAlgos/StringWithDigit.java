package code.otherAlgos;

public class StringWithDigit {

    public static void main(String[] args) {

        System.out.println(StringWithDigit.isDgit("eds"));
    }


    public static boolean isDgit(String s1) {

        char[] array = s1.toCharArray();

        for (char c : array) {
            return Character.isDigit(c);
        }
        return false;
    }
}
