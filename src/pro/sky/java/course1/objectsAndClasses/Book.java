package pro.sky.java.course1.objectsAndClasses;

public class Book {
    String bookName;
    String Author;
    int publishingYear;

    public Book createBook(String bookName, int publishingYear, String Author) {
        this.bookName = bookName;
        this.Author = Author;
        this.publishingYear = publishingYear;

    }
}
