package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;
    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void drive() {
    int total = car.getTotalDistance();
    car.drive(125);
    assertEquals(total+125, car.getTotalDistance());
    }
}