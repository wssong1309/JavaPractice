package ClassExample.java_11.dequestack;

public class DequeStackTest {
    public static void main(String[] args) {
        Book book = new Book("Java DequeStack");
        book.addPage(new Page(0, "표지"));
        book.addPage(new Page(1, "인사말"));
        book.addPage(new Page(2, "목차"));
        book.addPage(new Page(3, "ArrayList"));
        book.addPage(new Page(4, "LinkedList"));
        book.addPage(new Page(5, "Stack Data Structure"));
        book.addPage(new Page(6, "Queue Data Structure"));

        book.view();
        book.nextPage();
        book.view();
        book.nextPage();
        book.view();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        book.prevPage();
        book.view();
        book.prevPage();
        book.view();
    }
}
