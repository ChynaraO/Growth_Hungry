package DesignPatterns.Structural.Decorator;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olive";
    }
}
