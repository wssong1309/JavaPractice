package ch07.practice01;

public class Concrete extends Abstract{
    int j;
    public Concrete(int i, int j) {
        super(i);
        this.j = j;
    }
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }

    public void show() {
        System.out.println("i = " + getI() + ", j = " + j);
    }
}
