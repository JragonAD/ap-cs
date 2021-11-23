public class Book {
    private String name, author;
    private boolean isLowned = false;

    public Book(String n, String a, boolean i) {
        name = n;
        author = a;
        isLowned = i;
    }

    public Book(String n, String a) {
        name = n;
        author = a;
    }

    public String getBookName() {
        return name;
    }

    public String getAuthorName() {
        return author;
    }

    public boolean getLoanStatus() {
        return isLowned;
    }

    public void setBookName(String n) {
        name = n;
    }

    public void setAuthorName(String a) {
        author = a;
    }

    public void setLoanStatus(boolean i) {
        isLowned = i;
    }

    public String toString() {
        return name + ", " + author + ", " + (isLowned ? "Checked Out" : "Checked In");
    }
}