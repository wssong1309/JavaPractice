package ClassExample.java_101;

public class GenericsTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Generics", "Semyung");
        Book b2 = new Book("Spring Framework", "Semyung");
        Book b3 = new Book("Spring Boot", "SmartIT");

        Cart<Book> cart1 = new Cart<>(); // 여기서 Book : Type Argument
        cart1.add(b1);
        cart1.add(b2);
        cart1.add(b3);

        cart1.printAllItems();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        Music[] musics = new Music[]{
            new Music("Pretender", "Official Hige Dandism"),
            new Music("Betelgius", "Yuuri"),
            new Music("Koi", "Hoshino Gen")
        };
        
        Cart<Music> cart2 = new Cart(musics);
        
        System.out.println(cart2.get(2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cart2.printAllItems();
    }
}
