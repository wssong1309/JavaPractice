package ClassExample.java_103;

import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java List Interface", "List");
        Book b2 = new Book("Java Collection Interface", "Collection");
        Book b3 = new Book("Spring Boot", "Spring");

        Cart cart = new Cart();
        cart.add(b1);
        cart.add(b3);
        cart.add(1, b2);

        System.out.println(cart.checkForDuplicate(b1) + "\n");
        Book b4 = new Book("Spring Framework", "Spring");
        System.out.println(cart.checkForDuplicate(b4) + "\n");
        
        System.out.println(cart.getBook(2) + "\n");

        List<Book> books = cart.getAllBooks();
        System.out.println(books.toString() + "\n");

        // [1] for i loop
        Cart.printAllBooksWithFor(cart.getAllBooks());
        System.out.println();

        // [2] Iterator
        Cart.printAllBooksWithIterator(books);
        System.out.println();

        // [3] ListIterator
        Cart.printAllBooksWithListIterator(books);
        System.out.println();
    }
}
