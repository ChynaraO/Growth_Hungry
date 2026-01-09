package DesignPatterns.Structural.Bridge;

public class Square extends Shape{
    Square(Color color){
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Square in " + color.fill());
    }
}
