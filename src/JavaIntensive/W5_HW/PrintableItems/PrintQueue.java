package JavaIntensive.W5_HW.PrintableItems;

public class PrintQueue {
    public static void printReverse(Printable[] printable){
        for (int i = printable.length-1; i >= 0 ; i--) {
            printable[i].print();
        }
    }
}
