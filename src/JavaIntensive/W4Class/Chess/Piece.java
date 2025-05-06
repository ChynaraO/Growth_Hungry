package JavaIntensive.W4Class.Chess;

public class Piece {
    protected int x, y;
    protected String color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean canMove(int nx, int ny) {
        return false;
    }

    public void move(int nx, int ny) {
        if (canMove(nx, ny)) {
            this.x = nx;
            this.y = ny;
        }
    }

    public boolean canBeat(int nx, int ny) {
        return false;
    }
    public void beat(int nx, int ny) {
        if(canBeat(nx, ny)){
            this.x = nx;
            this.y = ny;
        }
    }

    public String toString(){
        return "x = " + this.x + "; " + "y = " + this.y;
    }
}
