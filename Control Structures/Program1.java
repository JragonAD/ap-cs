public class Program1 {
    public static void main(String[] args) {
        int n = 10, x = 1, y = x;

        while (x < n) {
            x++;
            System.out.println(x);
        }
        for (int p = y; p < n; p++) {
            y++;
            System.out.println(y);
        }
    }
}