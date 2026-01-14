package DesignPatterns.Structural.Composite.Example1;

public class ClientMain {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("resume.pdf");
        FileSystemItem file2 = new File("photo.jpg");
        CompositeFolder documents = new CompositeFolder("Documents");
        documents.add(file1);
        documents.add(file2);
        documents.showDetail();
        CompositeFolder root = new CompositeFolder("Root");
        root.add(documents);
        root.showDetail();
    }
}
