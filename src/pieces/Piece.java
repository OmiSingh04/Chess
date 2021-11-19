package pieces;

import util.Position;

import java.util.List;

public abstract class Piece {

    protected Position position;
    protected char color;
    protected int ID;

    public Piece(int x, int y, char color, int ID){
        this.position = new Position(x, y);
        this.color = color;
        this.ID = ID;
    }

    private void addToPosition(int x, int y){//ye ye ill come up with better names later.
        this.position.add(x, y);

    }

    public abstract List<Position> getValidMoves();

}
