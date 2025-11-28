package DesignPatterns.Creational.FactoryMethod.Example1;

public class Usage {
    public static void main(String[] args) {
        DocumentFactory docFactory = new DocFactory();
        Document doc = docFactory.createDocument();
        doc.open();
        DocumentFactory pdfFactory = new PDFFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();
    }
}
