import java.util.Scanner;

public class Program3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            System.out.print("Enter the integer (-99 to exit): ");
            input = sc.nextInt();
            if (input == -99) {
                System.out.println("\nMS. AVELLINO IS GREAT!!");
                break;
            }
            System.out.println("\n" + input + " has " + digit(input) + " digits\n\n\n");
        }
    }

    public static int digit(int num) {
        if (num < 10) {
            return 1;
        }
        return digit(num / 10) + 1;
    }
}