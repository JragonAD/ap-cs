import java.util.Scanner;

public class Program8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sumTo, totalSum;
    System.out.print("Enter a number to find the sum to: ");
    sumTo = sc.nextInt();
    totalSum = sum(1, sumTo / 2) + sum(sumTo / 2 + 1, sumTo);
    System.out.println("The sum of all integers up to that number is " + totalSum);
  }

  public static int sum(int cur, int end)
  {
    return cur == end ? cur : sum(cur + 1, end) + cur;
  }
}