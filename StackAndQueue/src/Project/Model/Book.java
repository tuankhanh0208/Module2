package Project.Model;

public class Book extends Document{
    private String author;
    private int pageBook;
    public Book(){}
    public Book(String author,int pageBook){
        this.author=author;
        this.pageBook=pageBook;
    }
    public Book(String name,String publishName,int releaseNumber,String author,int pageBook){
        super(name,publishName,releaseNumber);
        this.author=author;
        this.pageBook=pageBook;
    }

    public Book(int id, String name, String pubishName, int releaseNumber, String author, int pageBook) {
        super(id, name, pubishName, releaseNumber);
        this.author = author;
        this.pageBook = pageBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageBook() {
        return pageBook;
    }

    public void setPageBook(int pageBook) {
        this.pageBook = pageBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageBook=" + pageBook +
                '}';
    }
}
