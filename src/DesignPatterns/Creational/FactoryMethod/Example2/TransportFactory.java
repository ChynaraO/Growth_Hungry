package DesignPatterns.Creational.FactoryMethod.Example2;

public class TransportFactory {
    public Transport createTransport(String type) {
        if (type == null) return null;

        switch (type.toUpperCase()) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
