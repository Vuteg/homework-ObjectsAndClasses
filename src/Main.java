public class Main { ;
        public static void main(String[] args) {

        Author author = new Author("Ray", "Bradbury");
        Book book = new Book("451 fahrenheit", new Author(author.getNameAuthor(),author.getSurnameAuthor()), 1953);
        System.out.println(book);
        System.out.println(author);
        System.out.println();

            Author author1 = new Author("Allen", "Carr");
        Book book1 = new Book("The easy way to stop smoking", new Author(author1.getNameAuthor(), author1.getSurnameAuthor()), 1985);
        System.out.println(book1);
        System.out.println(author1);

        Author author2 = new Author("Fyodor", "Dostoevsky");
        Book book2 = new Book("Crime and punishment", new Author(author2.getNameAuthor(), author2.getSurnameAuthor()), 1866);
        System.out.println(book2);
        System.out.println(author2);
        System.out.println();

            Author author3 = new Author("Name", "Surname");
            Book book3 = new Book("book name", new Author(author3.getNameAuthor(), author3.getSurnameAuthor()), 1995);
            System.out.println(book3);
            System.out.println(author3);
            System.out.println();

            book3.setYearOfPublication(2000);
            System.out.println("book3.getYearOfPublication() = " + book3.getYearOfPublication());

            System.out.println("===================================================================================");

            Author author4 = new Author("Clone","Jack");
            Author author5 = new Author("Clone","Jack");
            Book book4 = new Book("Name1", new Author(author4.getNameAuthor(), author4.getSurnameAuthor()),1703);
            Book book5 = new Book("Name1", new Author(author3.getNameAuthor(), author3.getSurnameAuthor()),2200);
            Book book6 = new Book("Name2", new Author(author4.getNameAuthor(), author4.getSurnameAuthor()),1703);

            System.out.println(book4.equals(book5));
            System.out.println(book4.equals(book6));
            System.out.println(author4.equals(author5));
            System.out.println(author3.equals(author5));


        }
}