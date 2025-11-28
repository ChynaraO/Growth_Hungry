package DesignPatterns.Creational.FactoryMethod.Example2;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }
}
