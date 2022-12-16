public class Main {
    public static void main(String[] args) {

        Author author = new Author("Ray", "Bradbury");
        Book book = new Book("451 fahrenheit", author.getNameAuthor()+ " " + author.getSurnameAuthor(), 1953);
        System.out.println("book.getBookName() = " + book.getBookName());
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());


        Author author1 = new Author("Allen", "Carr");
        Book book1 = new Book("The easy way to stop smoking", author1.getNameAuthor() + " " + author1.getSurnameAuthor(), 1985);
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getAuthorName() = " + book1.getAuthorName());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        book1.setYearOfPublication(1987);
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());



    }
}