package JavaIntensive.W5_HW.PrintableItems;

public class Document implements Printable{

    String filename;
    public Document(String filename){
        this.filename = filename;
    }
    @Override
    public void print() {
        System.out.println("Printing the "+filename);
    }
}
