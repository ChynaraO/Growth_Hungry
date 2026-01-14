package DesignPatterns.Structural.Composite.Example3;

public class Main {
    public static void main(String[] args) {
    // Bedroom furniture
        FurnitureItem bed = new SingleFurnitureItem("Bed", 20000);
        FurnitureItem wardrobe = new SingleFurnitureItem("Wordrobe", 15000);
        FurnitureItem nightStand = new SingleFurnitureItem("Night Stand", 5000);

        FurnitureGroup bedroom = new FurnitureGroup("Bedroom");
        bedroom.add(bed);
        bedroom.add(wardrobe);
        bedroom.add(nightStand);

        FurnitureItem sofa = new SingleFurnitureItem("Sofa", 25000);
        FurnitureItem tvUnit = new SingleFurnitureItem("TV Unit", 12000);

        FurnitureGroup livingRoom = new FurnitureGroup("Living room");
        livingRoom.add(sofa);
        livingRoom.add(tvUnit);

        FurnitureGroup apartment = new FurnitureGroup("Apartment");
        apartment.add(livingRoom);
        apartment.add(bedroom);
        System.out.println("Bedroom total price: "
                +bedroom.getPrice());
        System.out.println("Apartment total price: "
                +apartment.getPrice());
    }
}
