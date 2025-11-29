package DesignPatterns.Creational.AbstractFactory;

public class MacCheckbox implements Checkbox {
    /**
     *
     */
    @Override
    public void check() {
        System.out.println("Mac Checkbox Checked");
    }
}
