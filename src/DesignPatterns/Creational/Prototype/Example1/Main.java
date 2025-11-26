package DesignPatterns.Creational.Prototype.Example1;

public class Main {
    public static void main(String[] args) {
        Circle original = new Circle(10);

        //clone it
        Circle copy = (Circle) original.clone();
        original.draw(); //circle with radius 10
        copy.draw(); //circle with radius: 10

        System.out.println(original == copy);//false
        // different objects, but same values
    }
}
