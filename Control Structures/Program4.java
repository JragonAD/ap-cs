public class Program4 {
    public static void main(String[] args) {
        int x = 11, y = x;
        if (x > 10) {
            x *= 2;
        }
        if (x > 20) {
            x = 0;
        }
        System.out.println(x);
        if (y > 10) {
            y = 0;
        }
        System.out.println(y);
    }
}