package DesignPatterns.Structural.Bridge;

public class Circle extends Shape{
    Circle(Color color){
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle in " + color.fill());
    }
}
