package pro.sky.java.course1.objectsAndClasses;

public class Book {
   private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book (String bookName, Author author,  int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;

    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor () {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear( int p){
        if (publishingYear < 1950 || publishingYear > 2022) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;

    }
    public String getBookInfo() {
        return "Книга " + getBookName() + " автор " + author.combineAuthorFIO() + " опубликованная в " + getPublishingYear();
    }

}
