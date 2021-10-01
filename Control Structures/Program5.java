public class Program5 {
    public static void main(String[] args) {
        int x = 30, y = 40;
        if (x >= 0) {
            if (x <= 100) {
                y = 3 * x;
                if (y < 50)
                    y = 0;
            } else {
                y = x * 2;
            }
        } else {
            x = 69420;
        }

        System.out.println(x + " " + y);
    }

}
