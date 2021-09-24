import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 99999: ");
        displayDigits(sc.nextInt());
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int input) {
        int tempOutput, digit, length;
        length = Integer.toString(input).length();
        for (int i = 1; i <= length; i++) {
            digit = (int) Math.pow(10, length - i);
            tempOutput = quotient(input, digit);
            input = remainder(input, digit);
            System.out.print(tempOutput + "  ");
        }
    }
}
