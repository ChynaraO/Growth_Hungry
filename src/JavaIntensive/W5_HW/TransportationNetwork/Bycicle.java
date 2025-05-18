package JavaIntensive.W5_HW.TransportationNetwork;

public class Bycicle extends TransportVehicle{

    public Bycicle(String name, int speed){
        super(name,speed);
    }
    @Override
    void move() {
        System.out.println("Moves slowly");
    }

    @Override
    public void start() {
        System.out.println(name + " is pedaling at " + speed + " km/h.");
    }
}
