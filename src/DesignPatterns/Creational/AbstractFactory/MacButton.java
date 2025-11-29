package DesignPatterns.Creational.AbstractFactory;

public class MacButton implements Button{
    /**
     *
     */
    @Override
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}
