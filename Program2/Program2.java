
/**
 * Write a description of class Program2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program2
{
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++)
            System.out.println(
                "*".repeat(i) + " ".repeat((10 - i) * 2) + "*".repeat(i)
            );
    }
}
