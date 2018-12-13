package code.otherAlgos;

//Write a Java program that prints the numbers from 1 to 50.
// But for multiples of three print "Fizz" instead of the number and for the multiples of
// five print "Buzz". For numbers which are multiples of both three and five print "FizzBuz

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz printFizzBuzz = new FizzBuzz();
        printFizzBuzz.print(1, 15);
    }

    private void print(int from, int to) {
        if (from < 1 || to > 50) {
            System.out.println("Input not as per requirements");
            return;
        }
        for (from = 1; from <= to; from++) {
            if (from % 15 == 0)
                System.out.print("FizzBuz\n");
            else if (from % 3 == 0)
                System.out.print("Fizz\n");
            else if (from % 5 == 0)
                System.out.print("Buzz\n");
            else
                System.out.println(from);
        }
    }
}
