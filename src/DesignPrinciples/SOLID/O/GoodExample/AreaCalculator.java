package DesignPrinciples.SOLID.O.GoodExample;

//This class is now closed for modification
public class AreaCalculator {
    double calculate(Shape shape){
        return shape.getArea();
    }
}
