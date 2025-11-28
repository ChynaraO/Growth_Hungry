package DesignPatterns.Creational.FactoryMethod.Example2;


public class Bike implements Transport {
    /**
     *
     */
    @Override
    public void deliver() {
        System.out.println("Delivering by Bike");
    }
}
