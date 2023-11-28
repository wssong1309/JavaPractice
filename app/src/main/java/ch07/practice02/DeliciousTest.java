package ch07.practice02;

interface Edible {
    void eat();
}
interface Sweetable {
    void sweet();
}

interface Delicious extends Edible, Sweetable {
    void delicious();
}

class DeliciousConcrete implements Delicious {

    @Override
    public void delicious() {
        System.out.println("this food is delicious");
    }

    @Override
    public void eat() {
        System.out.println("this food is edible");
    }

    @Override
    public void sweet() {
        System.out.println("this food is sweet");
    }
    
}

public class DeliciousTest{
    public static void main(String[] args) {
        DeliciousConcrete f = new DeliciousConcrete();
        f.eat();
        f.sweet();
        f.delicious();
    }
}
