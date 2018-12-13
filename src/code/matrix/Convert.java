package code.matrix;

public class Convert {

    public static void main(String[] args) {

        //   System.out.println(Convert.getBinary(5));


        System.out.println(Convert.getDecimal("101"));
    }

    public static String getBinary(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int reminder = n % 2;
            sb.append(reminder);
            n = n / 2;
        }
        return sb.toString();
    }

    public static int getDecimal(String binary) {

        int binaryNumber = Integer.parseInt(binary);
        int decimal = 0;
        int temp;
        int p=0;

        while (binaryNumber!=0) {
            temp = binaryNumber % 10;
            decimal += temp * Math.pow(2, p);
            binaryNumber = binaryNumber / 10;
            p++;
        }
        return decimal;
    }
}
