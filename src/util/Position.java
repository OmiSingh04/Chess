package util;

public class Position {//0 to 7 or 1 to 8? 0 to 7 mf.
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

}//order is mehh