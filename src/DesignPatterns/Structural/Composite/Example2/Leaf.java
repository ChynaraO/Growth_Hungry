package DesignPatterns.Structural.Composite.Example2;

public class Leaf implements Component {

    String name;
    Double price;
    public Leaf(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice() {
        System.out.println(this.price);
    }
}
