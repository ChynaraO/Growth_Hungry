package JavaIntensive.W5_HW.PrintableItems;

public class Photo implements Printable{

   String color;
//   public Photo(String color){
//       this.color = color;
//   }
   @Override
    public void print() {
       System.out.println("Printing in " + color);
    }
}
