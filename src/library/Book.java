package library;

public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private String subjectName;
    private int copies=0;
    private String date;

    public Book(int id, String bookName, String authorName, String subjectName, int copies, String date) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.subjectName = subjectName;
        this.copies = copies;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", copies=" + copies +
                ", date='" + date + '\'' +
                '}';
    }
}
