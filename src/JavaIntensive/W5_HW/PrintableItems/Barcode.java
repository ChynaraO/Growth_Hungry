package JavaIntensive.W5_HW.PrintableItems;



public class Barcode implements Printable{
    String barcode;
    public Barcode(String barcode){
        this.barcode = barcode;
    }
    @Override
    public void print() {
        System.out.println("Barcode " + barcode + " sent to label printer" );
    }
}
