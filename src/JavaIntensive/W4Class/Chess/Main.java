package JavaIntensive.W4Class.Chess;

public class Main {
    public static void main(String[] args) {
        Piece p1 = new Knight(2, 1, "White");
        Piece p2 = new Pawn(3, 3, "Black");

        p1.beat(p2.getX(), p2.getY());
        System.out.println(p1.toString());
    }
}
