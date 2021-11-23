import java.util.Scanner;

public class Driver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String name, author;
        boolean isCheckedIn;
        System.out.println("Welcome to the Shaker High Library System. Enter books (-1 to exit).");

        Library shakerLibrary = new Library();
        do {
            System.out.println("Enter book name: ");
            name = sc.nextLine();
            System.out.println("Enter author name: ");
            author = sc.nextLine();
            System.out.println("Is the book checked in? (y/n): ");
            shakerLibrary.add(new Book(name, author, getYN()));
        } while (keepGoing());

        System.out.println("There are " + shakerLibrary.getNumBooks() + " books in the library.");
        System.out.println("Checking out the first book in the library: " + shakerLibrary.checkoutBook(0));
        System.out.println("Enter a book name to check if it is checked in: ");
        isCheckedIn = shakerLibrary.isCheckedIn(sc.nextLine());
        System.out.println("That book is " + (isCheckedIn ? "" : " not ") + " checked in");
    }

    public static boolean keepGoing() {
        System.out.println("Do you have another book? (y/n): ");
        return getYN();
    }

    public static boolean getYN() {
        return sc.nextLine().toLowerCase().substring(0, 1) == "y";
    }
}
