package AccessModifiers;

public class BookAccessDemo {
    public String ISBN;
    protected String title;
    private String author;

    public BookAccessDemo(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
