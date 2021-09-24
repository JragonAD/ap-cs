public class Program5 {
    static String hex[] = { "A", "B", "C", "D", "E", "F" };

    public static void main(String args[]) {
        for (int i = 1; i <= 256; i++) {
            System.out.println(i + "\t" + wrapper(i, 2) + wrapper(i, 8) + wrapper(i, 16));
        }
    }

    public static String wrapper(int num, int base) {
        String output = convert(num, base);
        return output.length() > 7 ? output + "\t" : output + "\t\t";
    }

    public static String convert(int num, int base) {
        int quotient = (int) ((double) num / base);
        int remainder = num % base;
        String out = remainder < 10 ? "" + remainder : hex[remainder - 10];
        return quotient == 0 ? out : convert(quotient, base) + out;
    }
}