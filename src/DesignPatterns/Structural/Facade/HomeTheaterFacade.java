package DesignPatterns.Structural.Facade;

//Provides a simple interface to a complex system.

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound){
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }
    void watchMovie(String movie){
        projector.on();
        sound.on();
        sound.setVolume(10);
        dvd.on();
        dvd.play(movie);
    }
}
