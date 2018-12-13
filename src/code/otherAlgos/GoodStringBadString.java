package code.otherAlgos;

public class GoodStringBadString {


    public static void main(String[] args) {

        System.out.println(validate("dvgaaaaa"));
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    static int validate(String str) {
        int vCount = 0, conCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vCount++;
                conCount = 0;
                if (vCount > 5) {
                    return 0;
                }
            } else if (str.charAt(i) != '?') {
                conCount++;
                vCount = 0;
                if (conCount > 3) {
                    return 0;
                }
            } else {
                if (vCount == 5 || conCount == 3) return 0;
                else {
                    vCount++;
                    conCount++;
                }
            }
        }
        return 1;
    }

}
