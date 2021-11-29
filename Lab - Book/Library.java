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
                if (b.getLoanStatus()) {
                    numBooks++;
                }
                return;
            }
        }
        throw new java.lang.RuntimeException("There is no space left in the library.");
    }

    public int findBookIndex(String bookName) {
        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] != null && libraryBooks[i].getBookName().equals(bookName)
                    && libraryBooks[i].getLoanStatus()) {
                return i;
            }
        }
        return -1;
    }

    public Book checkoutBook(String bookName) {
        int index = this.findBookIndex(bookName);
        libraryBooks[index].setLoanStatus(false);
        numBooks--;
        return libraryBooks[index];
    }

    public boolean isCheckIn(String bookName) {
        return this.findBookIndex(bookName) != -1;
    }

    public String toString() {
        String output = "\n";
        for (Book book : libraryBooks) {
            if (book != null) {
                output += book + "\n";
            }
        }
        return output;
    }
}
