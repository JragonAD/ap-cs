public class Program2 {
    public static void main(String[] args) {
        System.out.println("Part 2: " + part2());
    }

    public static int part2() {
        int i, n = 0;
        while (n < 90) {
            for (i = 0; i < 10; i++) {
                n += 3;
                if (n > 50)
                    break;
            }
            n++;
        }
        return n;
    }
}
