package DesignPatterns.Structural.Composite.Example3;

public class SingleFurnitureItem implements FurnitureItem {
    String name;
    double price;

    public SingleFurnitureItem(String name, double price){
        this.price = price;
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
}
