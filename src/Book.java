public class Book {
    private String bookName;
    private Author authorName;
    private int yearOfPublication;

    public Book(String bookName, Author authorName, int yearOfPublication) {
        this.bookName = bookName;
        this.authorName = new Author(authorName.getNameAuthor(), authorName.getSurnameAuthor());
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookName() {
        return bookName;
    }
 public String getAuthorName(){ return authorName.getNameAuthor() + " " + authorName.getSurnameAuthor();}

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
