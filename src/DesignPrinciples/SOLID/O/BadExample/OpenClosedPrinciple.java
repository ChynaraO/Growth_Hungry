package DesignPrinciples.SOLID.O.BadExample;

public class OpenClosedPrinciple {
    /*
    software entities( classed, modules, functions, etc)
     should be open for extension, but closed for modification.
   bag example:-Using if/else statements to handle different types.
   To add a Triangle, you must modify this class.
     */

    class AreaCalculator{
        double calculate(ShapeClass shape){
            if(shape.type == "Rectangle"){
                return shape.width * shape.height;
            }
            if(shape.type == "Circle"){
                return 3.14 * shape.radius * shape.radius;
            }
            return 0;
        }

    }
}
