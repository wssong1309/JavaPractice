package ClassExample.java_11.dequestack;

public class Page {
    private int no;
    private String contents;

    // Constructor
    public Page(int no, String contents) {
        this.no = no;
        this.contents = contents;
    }

    // Getter, Setter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    // toString
    @Override
    public String toString() {
        return no + "페이지 ==> " + contents;
    }

}
