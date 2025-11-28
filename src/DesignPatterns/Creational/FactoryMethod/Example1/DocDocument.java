package DesignPatterns.Creational.FactoryMethod.Example1;

public class DocDocument implements Document {
    /**
     *
     */
    @Override
    public void open() {
        System.out.println("Opening a DOC document.");
    }
}
