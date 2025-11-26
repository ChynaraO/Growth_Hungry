package DesignPatterns.Creational.Prototype.Example2;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter("Warrior", 100, 50);
        //Clone the warrior to create a new character template
        GameCharacter clone = (GameCharacter) warrior.clone();
        warrior.info();
        clone.info();
    }

}
