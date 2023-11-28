package ClassExample.java_09.comparabletest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "S", "e", "m", "y", "u", "n", "g");
        Collections.sort(list); // ASCII코드대로 오름차순 정렬(Ascii코드는 대문자가 소문자보다 숫자가 작다.)
        System.out.println(list);

        List<Book> books = new ArrayList<>();
        Collections.addAll(books, new Book(1, "Python"), new Book(1, "Java"), new Book(3, "Spring Boot"));
        Collections.sort(books); // 번호로 오름차순 정렬, 같으면 책 제목으로 오름차순 정렬
        System.out.println(books);
    }
}
