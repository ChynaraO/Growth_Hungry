package DesignPatterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade theater =
                new HomeTheaterFacade(
                        new DVDPlayer(),
                        new Projector(),
                        new SoundSystem()
                );
        theater.watchMovie("Inception");
    }
}
