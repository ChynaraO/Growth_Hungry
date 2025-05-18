package JavaIntensive.W5_HW.TransportationNetwork;

public class Main {
    /*
    2. Transportation Network (Abstract Class)
Requirements:
●
●
●
Create an abstract class TransportVehicle with:
○
Fields: String name, int speed
○
Method: start() (prints that the vehicle has started)
○
Abstract method: move()
Create subclasses:
○
Bicycle: moves slower and prints “pedaling...
”
○
Train: moves fast and prints “train is accelerating on tracks”
Store in a TransportVehicle[] and call start() and move() on each element.
Discussion:
●
●
Why is TransportVehicle a good candidate for an abstract class?
Could we model this using an interface instead? When would that make sense?
     */
    public static void main(String[] args) {
        TransportVehicle[] transport = new TransportVehicle[2]; //and call start() and move() on each element.
        transport[0] = new Bycicle("28", 10);
        transport[1] = new Train("BCS23", 40);

        for(TransportVehicle transportVehicle : transport){
            transportVehicle.start();
            transportVehicle.move();
        }
    }
}
