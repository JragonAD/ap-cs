import java.util.Scanner;

public class Program6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0, currentCharge;
        do {
            System.out.print("Enter the hours parked: ");
            total += currentCharge = calculateCharges(sc.nextDouble());
            System.out.println("The cost for parking was " + currentCharge);
        }
        while (keepGoing());
        System.out.println("The total charge for all the customers is: " + total);
    }

    public static double calculateCharges(double hours) {
        return Math.min(Math.max(2, 2 + (hours - 3) * .5), 10);
    }
    public static boolean keepGoing() {
        System.out.print("Do you have another customer (y/n): ");
        return sc.next().charAt(0) == 'y' ? true : false; 
    }
}