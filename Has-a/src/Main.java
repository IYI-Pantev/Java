public class Main {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

//        for(Book book : books){
//            System.out.println(book.displayInfo());
//        }

        Library library = new Library("Sofia Library", 1879, books);

        library.displayInfo();


    }
}
