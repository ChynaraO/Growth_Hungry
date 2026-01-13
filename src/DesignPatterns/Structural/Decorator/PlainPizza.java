package DesignPatterns.Structural.Decorator;
//ConcreteComponent
public class PlainPizza implements Pizza{
    /**
     * @return
     */
    @Override
    public double getCost() {
        return 200;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
