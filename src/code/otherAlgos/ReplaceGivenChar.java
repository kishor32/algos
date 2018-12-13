package code.otherAlgos;

public class ReplaceGivenChar {

    public static void main(String[] args) {
        System.out.println(ReplaceGivenChar.replace("kis hor is", " ", "%20"));
    }

    public static String replace(String s1, String given, String to) {

        if (s1.indexOf(given) > -1) {
            return s1.replace(given, to);
        }
        return null;
    }
}
