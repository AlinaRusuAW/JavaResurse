package com.example;

public class Examen {
    float km;
    String currentMessage = "";

    public float convert(float mile) {
        km = 1.609344f;
        km = km * mile;
        currentMessage = (mile + " mile este egal cu " + km + " km.");
        return km;
    }
    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public String getCurrentMessage() {
        return currentMessage;
    }

    public void setCurrentMessage(String currentMessage) {
        this.currentMessage = currentMessage;
    }
}
