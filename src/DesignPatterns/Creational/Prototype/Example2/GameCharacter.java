package DesignPatterns.Creational.Prototype.Example2;

import javax.crypto.spec.PSource;

public class GameCharacter implements Prototype{

    private String name;
    private int health;
    private int strength;

    public GameCharacter(String name, int health, int strength){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    private GameCharacter(GameCharacter character){
        this.name = character.name;
        this.health = character.health;
        this.strength = character.strength;
    }

    @Override
    public Prototype clone() {
        return new GameCharacter(this);
    }
    public void info(){
        System.out.println(name + " | HP: " + health + " | STR: " + strength);
    }
}
