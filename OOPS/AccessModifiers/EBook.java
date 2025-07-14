package AccessModifiers;

public class EBook extends BookAccessDemo {
    String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Author: " + getAuthor());
    }
}
