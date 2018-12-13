package code.otherAlgos;

public class Reminder {

    public static void main(String[] args) {

        Reminder.checkPlindrom(131);
    }

    private static void reminder(int i, int i1) {

        int count = 0;
        int reminder = 0;

        while (count <= i) {

            reminder = i % i1;
            count++;
        }
        System.out.println(reminder);
    }

    public static void checkPlindrom(int n) {

        int reminder = 0;
        int reversed = 0;
        int original=n;

        while (n != 0) {
            reminder = n % 10;
            reversed = reversed * 10 + reminder;
            n = n / 10;
        }
        if (original == reversed) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
