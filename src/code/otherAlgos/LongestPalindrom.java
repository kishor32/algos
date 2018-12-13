package code.otherAlgos;

public class LongestPalindrom {

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }

    private String longestPalindrom(String s) {

        int len = s.length();
        String longest = String.valueOf(s.charAt(0));
        for (int i = 0; i < len; i++) {

            String temp = expand(s, i, i);
            System.out.println("at left="+i+"and right="+i+"---"+temp);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            temp = expand(s, i, i + 1);
            System.out.println("at left="+i+"and right="+(i+1)+"---"+temp);
            if (temp.length() > longest.length()) {
                longest = temp;
            }

        }
        return longest;
    }

    public static void main(String[] args) {

        System.out.println(new LongestPalindrom().longestPalindrom("adfgaba"));
    }
}
