package ch07.cointest;

interface Coin {
    int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}

public class Coin1Demo {
public static void main(String[] arg) {
    System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
    }
}