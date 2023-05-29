import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String bookName;
    private int pageNum;
    private String author;
    private int publishDate;

    public Book(String bookName, int pageNum, String author, int publishDate) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
}
