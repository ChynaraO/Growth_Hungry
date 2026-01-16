package DesignPatterns.Structural.Facade;

public class DVDPlayer {
    void on() {
        System.out.println("DVD Player ON");
    }
    void play(String movie){
        System.out.println("Playing " + movie);
    }
}
