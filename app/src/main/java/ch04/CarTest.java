package ch04;

class Car {
    private String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;

    public String getColor() {
        return color;
    }
    public static int getNumOfCar() {
        return numOfCar;
    }
    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Car(String color) {
        this.color = color.toLowerCase();
        numOfCar = this.color.compareTo("red") == 0 ? ++numOfCar : numOfCar;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
