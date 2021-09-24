import java.util.Scanner;

public class Program4 {
    public static void main(String args[]) {
        do {
            game();
        } while (check());
    }

    public static void game() {
        int curNum, numbers[] = new int[10];
        for (int i = 0; i < 3; i++) {
            System.out.print((curNum = randint()) + " ");
            numbers[curNum]++;
        }
        System.out.println();

        for (int num : numbers) {
            switch (num) {
                case 2:
                    System.out.println("Two numbers are the same.");
                    break;
                case 3:
                    System.out.println("Three numbers are the same.");
                    break;
            }
        }
    }

    public static boolean check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to continue (y/n)? ");
        return sc.next().charAt(0) == 'y' ? true : false;
    }

    public static int randint() {
        return (int) (Math.random() * 10);
    }
}