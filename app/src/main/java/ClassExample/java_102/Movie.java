package ClassExample.java_102;

public class Movie implements Content {
    private String title;
    private String writer;

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
