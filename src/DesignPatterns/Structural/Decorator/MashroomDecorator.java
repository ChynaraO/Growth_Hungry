package DesignPatterns.Structural.Decorator;

public class MashroomDecorator extends PizzaDecorator{
    public MashroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 40;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushroom";
    }


}
