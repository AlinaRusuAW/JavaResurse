package com.example;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(10);
        car.drive(5);
        car.drive(20);
        car.stop();
        car.getOut().printToConsole();
    }
}
