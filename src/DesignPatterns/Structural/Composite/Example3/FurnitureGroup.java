package DesignPatterns.Structural.Composite.Example3;

import java.util.ArrayList;
import java.util.List;

public class FurnitureGroup implements FurnitureItem {
    private String name;
    List<FurnitureItem> items = new ArrayList<>();

    public FurnitureGroup(String name){
        this.name = name;
    }

    public void add(FurnitureItem component){
        items.add(component);
    }
    /**
     * @return
     */
    @Override
    public double getPrice() {

        double total = 0;
        for(FurnitureItem c: items){
            total += c.getPrice();
        }
        return total;
    }
}
