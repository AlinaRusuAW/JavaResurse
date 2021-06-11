package com.example;

public class Car {
    String color;
    int wheels;
    //cantitatea de benzina in litri
    int currentDistance = 0;
    int fuel = 10;
    float fuelPerKm = 0.1f;
    int totalDistance = 0;
    MsgOut out = new MsgOut ();

    public int drive(int distance) {
        if ((distance * fuelPerKm) <= fuel) {
        } else {
            distance = (int) (fuel / fuelPerKm);
        }
        currentDistance = currentDistance + distance;
        fuel = fuel - (int) (distance * fuelPerKm);
        out.println ("M-am pornit. \n" + "Am parcurs distanta de " + distance + " km.");
        if (fuel == 0) {
            out.println ("Nu mai este combustibil. Alimenteaza-te!");
        }
        totalDistance = distance + totalDistance;
        return currentDistance;
    }

    public int refill(int addfuel) {
        out.println ("M-am alimentat cu " + addfuel + " litri, putem merge mai departe.");
        return addfuel;
    }

    public void stop() {
        out.println ("M-am oprit. \n" + "Distanta totala este " + totalDistance + " km.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public MsgOut getOut() {
        return out;
    }

    public void setOut(MsgOut out) {
        this.out = out;
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public float getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(float fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }
}
