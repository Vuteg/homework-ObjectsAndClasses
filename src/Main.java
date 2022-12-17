public class Main { ;
        public static void main(String[] args) {

        Author author = new Author("Ray", "Bradbury");
        Book book = new Book("451 fahrenheit", new Author(author.getNameAuthor(),author.getSurnameAuthor()), 1953);
        System.out.println("book.getBookName() = " + book.getBookName());
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println();

            Author author1 = new Author("Allen", "Carr");
        Book book1 = new Book("The easy way to stop smoking", new Author(author1.getNameAuthor(), author1.getSurnameAuthor()), 1985);
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getAuthorName() = " + book1.getAuthorName());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        System.out.println();

        Author author2 = new Author("Fyodor", "Dostoevsky");
        Book book2 = new Book("Crime and punishment", new Author(author2.getNameAuthor(), author2.getSurnameAuthor()), 1866);
            System.out.println("book2.getBookName() = " + book2.getBookName());
            System.out.println("book2.getAuthorName() = " + book2.getAuthorName());
            System.out.println("book2.getYearOfPublication() = " + book2.getYearOfPublication());
            System.out.println();

            Author author3 = new Author("Name", "Surname");
            Book book3 = new Book("Name book", new Author(author3.getNameAuthor(), author3.getSurnameAuthor()), 1995);
            System.out.println("book3.getBookName() = " + book3.getBookName());
            System.out.println("book3.getAuthorName() = " + book3.getAuthorName());
            System.out.println("book3.getYearOfPublication() = " + book3.getYearOfPublication());
            book3.setYearOfPublication(2000);
            System.out.println("book3.getYearOfPublication() = " + book3.getYearOfPublication());
        }
}