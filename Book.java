package HomeworkBook;

public class Book {
    String bookName;
    int pageNumber;
    String writerName;
    String publishDate;

    public Book(String bookName, int pageNumber, String writerName, String publishDate){
        this.bookName=bookName;
        this.pageNumber=pageNumber;
        this.writerName=writerName;
        this.publishDate=publishDate;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
