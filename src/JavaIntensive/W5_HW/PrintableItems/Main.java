package JavaIntensive.W5_HW.PrintableItems;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Document("Documents");
        printables[1] = new Barcode("12345");
        printables[2] = new Photo();
        for (Printable p : printables) {
           p.print();
        }
        //reversed order
        PrintQueue.printReverse(printables);
    }
}
