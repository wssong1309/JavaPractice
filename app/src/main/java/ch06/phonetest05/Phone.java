package ch06.phonetest05;

class Phone {
    protected String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void talk() {
        System.out.println(owner + "님이 통화중입니다.");
    }
}
