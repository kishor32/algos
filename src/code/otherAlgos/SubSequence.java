package code.otherAlgos;


public class SubSequence {

    private static boolean isSubSequence(String s1, String s2) {

        int i = 0;
        for(char c : s2.toCharArray()){
            if(i < s1.length() && s1.charAt(i) == c) i++;
        }
        return i == s1.length();
    }

    public static void main(String[] a){
        System.out.println(SubSequence.isSubSequence("abc", "abghcd"));
    }
}
