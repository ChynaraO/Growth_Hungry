package JavaIntensive.W5_HW.TransportationNetwork;

public abstract class TransportVehicle {
    protected String name;
    protected int speed;

    public TransportVehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void start(){
        System.out.println(name + " has started.");
    }
    abstract void move();
}
