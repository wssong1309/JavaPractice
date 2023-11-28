package ch07.practice01;

abstract class Abstract {
    private int i;
    public Abstract(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    abstract void show();
}
