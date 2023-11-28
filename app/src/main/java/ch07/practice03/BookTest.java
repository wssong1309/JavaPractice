package ch07.practice03;
// Arrays.sort() method를 이용하기 위해 java.util.Arrays를 import
import java.util.Arrays;
// compareTo method를 오버라이드하기 위해 Comparable 인터페이스를 implement
class Book implements Comparable{
    // Field
    private int price;
    // Constructor
    public Book(int price) {
        this.price = price;
    }
    // Getter, Setter
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * Comparable interface의 compareTo method를 구현한 class의 instance들은 그들끼리 순서를 갖게된다.
     * 수업에서는 삼항연산자를 이용했지만 여기서는 뺄셈을 이용해 구현했다. 
     */
    @Override
    public int compareTo(Object o) {
        Book b = (Book) o;
        // return < 0 -> this.price < b.price, return == 0 -> this.price == b.price, return > 0 -> this.price > b.price
        return this.price - b.price;
    }
    // toString() method로 price literal을 String 형태로 return
    @Override
    public String toString() {
        return "Book [price=" + price + "]";
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
        // foreach문을 이용해 원하는 값을 출력
        System.out.println("정렬 전");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        // 위에서 compareTo method를 구현했기 때문에 Book instance들은 순서를 가지고있고, .sort() method는 배열의 값들을 오름차순으로 정렬해준다.
        Arrays.sort(books);
        
        System.out.println("정렬 후");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}