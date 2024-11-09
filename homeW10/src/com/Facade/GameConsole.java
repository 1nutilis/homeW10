package com.Facade;

public class GameConsole {
    public void turnOn() {
        System.out.println("Game console is on.");
    }
    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }
    public void turnOff() {
        System.out.println("Game console is off.");
    }
}

