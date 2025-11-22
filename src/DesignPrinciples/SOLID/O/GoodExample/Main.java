package DesignPrinciples.SOLID.O.GoodExample;

public class Main {
    public static void main(String[] args) {

        //create shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6); // width = 4, height = 6
        Shape triangle = new Triangle(3, 8);

        //create calculator
        AreaCalculator calculator = new AreaCalculator();

        //calculate area
        double area = calculator.calculate(circle);

        //Print the result
        System.out.println("Area of circle: " + area);
        System.out.println("Rectangle area: " + calculator.calculate(rectangle));
        System.out.println("Triangle area: " + calculator.calculate(triangle));

    }
}
