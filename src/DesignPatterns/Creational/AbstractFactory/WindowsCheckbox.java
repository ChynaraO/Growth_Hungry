package DesignPatterns.Creational.AbstractFactory;

public class WindowsCheckbox implements Checkbox{
    /**
     *
     */
    @Override
    public void check() {
        System.out.println("Windows Checkbox Checked");
    }
}
