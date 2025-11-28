package DesignPatterns.Creational.FactoryMethod.Example1;

public class DocFactory implements DocumentFactory{
    /**
     * @return
     */
    @Override
    public Document createDocument() {
        return new DocDocument();
    }
}
