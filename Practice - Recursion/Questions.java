import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        System.out.println(product(6));
        mystery(0, 16);
        System.out.println("\n" + botswana(120, 108));
        System.out.println(avellino(330, 210));
        System.out.println(dirtadian(15, 7));
        print(5);
    }

    private static int product(int n) {
        if (n <= 1)
            return 1;
        else
            return n * product(n - 2);
    }

    public static void mystery(int a, int b) {
        System.out.print(a + " ");
        if (a <= b)
            mystery(a + 5, b - 1);
    }

    public static int botswana(int x, int y) {
        int temp = ghana(x, y);
        return x / temp * y;
    }

    public static int ghana(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return ghana(b, a % b);
    }

    public static int avellino(int x, int y) {
        int rem = x % y;
        if (rem == 0)
            return y;
        else {
            x = y;
            y = rem;
            return avellino(x, y);
        }
    }

    public static int dirtadian(int p, int q) {
        int n = 0;
        while (n < p) {
            n++;
            while (p < q) {
                p++;
                n += 2;
            }
        }
        return n;
    }

    public static void print (int n) {
        int x; 
        if(n > 0) {
            x = readInt();
            if (x > 0) {
                print(n - 1);
                System.out.println(x);
            }
        }
        else print(n);
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // D 
    // C 
    // C
}
