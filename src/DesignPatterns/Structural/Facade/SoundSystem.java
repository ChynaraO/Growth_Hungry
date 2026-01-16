package DesignPatterns.Structural.Facade;

public class SoundSystem {
    void on(){
        System.out.println("Sound system ON");
    }
    void setVolume(int level){
        System.out.println("Volume set to " + level);
    }
}
