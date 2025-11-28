package DesignPatterns.Creational.FactoryMethod.Example2;

public class Usage {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        Transport car = factory.createTransport("Car");
        car.deliver();

        Transport bike = factory.createTransport("Bike");
        bike.deliver();

        Transport truck = factory.createTransport("Truck");
        truck.deliver();
    }
}
