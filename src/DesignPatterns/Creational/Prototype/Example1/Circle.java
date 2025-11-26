package DesignPatterns.Creational.Prototype.Example1;

public class Circle implements Prototype {

    private int radius;


    public Circle(int radius){
        this.radius = radius;
    }
    //Copy constructor (important for prototype)
    private  Circle(Circle circle){
        this.radius = circle.radius;;
    }

    @Override
    public Prototype clone() {
        return new Circle(this); //cloning using copy constructor
    }

    public void draw() {
        System.out.println("Circle with radius: " + radius);
    }
}
