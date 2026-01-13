package DesignPatterns.Structural.Decorator;

abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    /**
     * @return
     */
    @Override
    public double getCost() {
        return pizza.getCost();
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
