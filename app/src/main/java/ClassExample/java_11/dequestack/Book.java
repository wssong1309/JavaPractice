package ClassExample.java_11.dequestack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Book {
    private String title;
    private Deque<Page> pageStack;
    private List<Page> pageList;
    private int currentPageNo;

    // Constructor
    public Book(String title) {
        this.title = title;
        this.pageStack = new ArrayDeque<>();
        this.pageList = new ArrayList<>();
    }

    // Getter, Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
    
    // Method
    public void addPage(Page page) {
        pageList.add(page);
    }

    public void nextPage() {
        pageStack.push(pageList.get(currentPageNo++));
    }

    public void prevPage() {
        Page page = pageStack.pop();
        currentPageNo = page.getNo();
    }

    public void view() {
        System.out.println(pageList.get(currentPageNo));
    }

    public void setCurrentPage(int currentPageNo) {
        this.currentPageNo = currentPageNo;
    }
}
