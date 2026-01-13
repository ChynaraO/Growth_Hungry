package DesignPatterns.Structural.Decorator;

public class CheeseDecorator extends  PizzaDecorator{

    public CheeseDecorator(Pizza pizza){
    super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}

