package ClassExample.java_09.comparabletest;

public class Book implements Comparable<Book> { // Comparable<Book>의 의미는 Comparable interface안에서 Book object를 사용하겠다는 뜻
    private int no;
    private String title;

    public Book(int no, String title) { // Dependency injection 중에 Constructor injection
        this.no = no;
        this.title = title;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    @Override // Comparable interface를 implement했으니 compareTo method를 구현
    public int compareTo(Book book) {
        int result = Integer.valueOf(no).compareTo(book.getNo()); 
        /* 
         *valueOf : String을 전달받아 Integer object를 반환하는 method이다.
         *Integer class에도 compareTo() method가 구현되어있기 때문에 사용할 수 있다.
         *기본적으로 Ascending이므로 result에는 this.no > book.getNo()이면 양수를 return한다.
         */
        if (result == 0) { // result가 0이라는 것은 this.no == book.getNo()라는 뜻이다.
            result = title.compareTo(book.title); // 책의 번호가 같으므로 책의 제목으로 정렬한다.
        }
        return result;
    }

    @Override // 출력을 위한 toString method
    public String toString() {
        return "Book [no=" + no + ", title=" + title + "]";
    }
}
