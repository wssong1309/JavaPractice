package ch04;

class Complex {
    private double real, image;

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImage() {
        return image;
    }
    public void setImage(double image) {
        this.image = image;
    }
    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    public Complex(double real) {
        this(real, 0.0);
    }
    public void print() {
        System.out.printf("%.1f + %.1fi\n", this.getReal(), this.getImage());
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
