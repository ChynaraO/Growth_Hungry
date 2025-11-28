package DesignPatterns.Creational.FactoryMethod.Example2;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Car");
    }
}
