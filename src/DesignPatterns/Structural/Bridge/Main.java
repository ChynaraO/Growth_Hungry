package DesignPatterns.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.draw();

        Shape square = new Square(new Blue());
        square.draw();
    }
}
