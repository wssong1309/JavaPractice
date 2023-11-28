package ClassExample.java_103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cart {
    private List<Book> books;
    
    // Default Constructor
    public Cart() {
        books = new ArrayList<>();
    }

    // 서점에서 이름으로 책을 찾고 카트에 추가하는 메소드
    public void add(Book book) {
        books.add(book);
    }

    // 서점에서 인덱스로 책을 찾고 카트에 추가하는 메소드
    public void add(int index, Book book) {
        books.add(index, book);
    }

    // 카트에 책을 중복해서 담았는지 확인하는 메소드
    public boolean checkForDuplicate(Book book) {
        return books.contains(book);
    }

    // 카트에 담긴 책 목록을 리턴하는 메소드
    public List<Book> getAllBooks() {
        return books;
    }

    // 카트에서 인덱스로 책을 찾는 메소드
    public Book getBook(int index) {
        return books.get(index);
    }    

// [1] for i loop 방식으로 책 목록 출력
    public static void printAllBooksWithFor(List<Book> books) {
        System.out.println("[1] for i loop 방식으로 책 목록 출력");
        for (int i = 0; i < books.size(); i++) {
            Book book  = books.get(i);
            System.out.println(book);
        }
    }
    
    // [2] Iterator 방식으로 출력
    public static void printAllBooksWithIterator(List<Book> books) {
        System.out.println("[2] Iterator 방식으로 출력");
        for(Iterator<Book> it = books.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
    
    // [3] ListIterator 방식으로 출력 (추천. List Interface에 존재하는 방식)
    public static void printAllBooksWithListIterator(List<Book> books) {
        System.out.println("[3] ListIterator 방식으로 출력");
        ListIterator<Book> it = books.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
/*
 * [1] ArrayList의 method들
 * ArrayList.add(E) : parameter로 받은 object를 ArrayList의 맨 끝에 추가
 * ArrayList.contains(Object) : ArrayList가 parameter로 받은 object를 포함하면 true를 return
 * ArrayList.get(int) : parameter로 받은 index 위치에 있는 element를 return
 * 
 * [2] List object를 출력하는 방법 세 가지
 * 1) for i loop
 * 
 * 2) Iterator (Iterate : 반복하다)
 * Iterator<T> it = List객체.iterator()로 iterator를 생성
 * Iterator.hasNext() : element가 더 있으면 true를 return
 * Iterator.next() : 반복에서 다음 element를 return
 * 
 * 3) ListIterator
 * 이름에서 알 수 있듯이 ListInterface에서 제공하는 방식이다.
 */
