package com.Facade;

public class AudioSystem {
    public void turnOn() {
        System.out.println("Audio system is on.");
    }
    public void turnOff() {
        System.out.println("Audio system is off.");
    }
    public void setVolume(int volume) {
        System.out.println("Audio volume set to " + volume);
    }
}

