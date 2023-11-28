package ClassExample.java_101;

public class Music {
    private String title;
    private String Singer;

    public Music(String title, String singer) {
        this.title = title;
        Singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    @Override
    public String toString() {
        return "Music [title=" + title + ", Singer=" + Singer + "]";
    }
}
