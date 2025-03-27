package Exercise1;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private boolean isLended;

    public Book() {}

    public Book(String title, String isbn, String author, boolean isLended) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isLended = isLended;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", isLended=" + isLended +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isLended() {
        return isLended;
    }

    public void setLended(boolean lended) {
        isLended = lended;
    }
}
