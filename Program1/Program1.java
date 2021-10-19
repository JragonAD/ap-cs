
/**
 * Write a description of class Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program1
{
    public static void main(String args[])
    {
        for (int i = 10; i > 0; i--)
            System.out.println(
                "*".repeat(i) + " ".repeat(10 - i) + 
                "\t\t" + " ".repeat(i - 1) + "*".repeat(11 - i)
            );
    }
}
