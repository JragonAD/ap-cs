import java.util.Scanner;

public class Driver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String name, author, bookName;
        boolean isCheckedIn;
        System.out.println("Welcome to the Shaker High Library System. Enter books (-1 to exit).");

        Library shakerLibrary = new Library();
        do {
            System.out.print("Enter book name: ");
            name = sc.nextLine();
            System.out.print("Enter author name: ");
            author = sc.nextLine();
            System.out.print("Is the book checked in? (y/n): ");
            shakerLibrary.add(new Book(name, author, getYN()));
        } while (keepGoing());

        System.out.println("\nLibrary: " + shakerLibrary);

        do {
            System.out.println("\nThere are " + shakerLibrary.getNumBooks() + " book(s) checked in in the library.");

            System.out.print("\nEnter a book name to check if it is checked in: ");
            bookName = sc.nextLine();
            isCheckedIn = shakerLibrary.isCheckIn(bookName);
            System.out.println("That book is " + (isCheckedIn ? "" : "not ") + "checked in.");
            if (isCheckedIn) {
                System.out.print("Would you like to check out the book? (y/n): ");
                if (getYN()) {
                    System.out.println("\nChecking out: " + shakerLibrary.checkoutBook(bookName));
                }
            }
        } while (keepGoing());
    }

    public static boolean keepGoing() {
        System.out.print("Do you have another book? (y/n): ");
        return getYN();
    }

    public static boolean getYN() {
        return sc.nextLine().toLowerCase().substring(0, 1).equals("y");
    }
}
