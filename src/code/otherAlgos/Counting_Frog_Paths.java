package code.otherAlgos;

public class Counting_Frog_Paths {

    public static void main(String[] args) {
        frogPath(0, 0, 5, 6);
    }

    static void frogPath(int X, int Y, int s, int T) {

        int count = 0;

        for (int i = X; i < X + s; i++) {
            for (int j = Y; j < Y + s; j++) {
                if (( i + j )<= T) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
