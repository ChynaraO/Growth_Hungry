package DesignPrinciples.SOLID.O.GoodExample;

public class Rectangle implements Shape {
    String type = "Rectangle";
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    /**
     * @return
     */
    @Override
    public double getArea() {
        return width * height;
    }
}
