package com.Facade;

public class HomeTheaterMain {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audio, dvd, console);

        homeTheater.startMovie();
        System.out.println();
        homeTheater.endMovie();
        System.out.println();

        homeTheater.startGame("Super Mario");
        System.out.println();
        homeTheater.endGame();
    }
}
