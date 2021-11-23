public class Library {
    private Book[] libraryBooks;

    private int numBooks;

    public Library(int size) {
        libraryBooks = new Book[size];
    }

    public Library() {
        libraryBooks = new Book[500];
    }

    public int getNumBooks() {
        return numBooks;
    }

    public void add(Book b) {
        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] == null) {
                libraryBooks[i] = b;
                numBooks++;
                return;
            }
        }
        throw new java.lang.RuntimeException("There is no space left in the library.");
    }

    public Book checkoutBook(int index) {
        Book temp = libraryBooks[index];
        libraryBooks[index] = null;
        return temp;
    }

    public boolean isCheckedIn(String bookName) {
        for (Book b : libraryBooks) {
            if (b.getBookName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }
}
