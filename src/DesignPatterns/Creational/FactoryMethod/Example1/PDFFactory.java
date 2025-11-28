package DesignPatterns.Creational.FactoryMethod.Example1;

public class PDFFactory implements DocumentFactory{
    /**
     * @return
     */
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
