package JavaIntensive.W5_HW.TransportationNetwork;

public class Train extends TransportVehicle {
    public Train (String name, int speed){
        super(name, speed);
    }
    @Override
    void move() {
        System.out.println(name + " is accelerating on tracks at "+ speed + " km/h");
    }

}
