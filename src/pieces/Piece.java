package pieces;

import util.Position;

import java.util.List;

public abstract class Piece {

    protected Position position;
    protected char color;

    public Piece(int x, int y, char color){
        this.position = new Position(x, y);
        this.color = color;
    }

    private void addToPosition(int x, int y){//ye ye ill come up with better names later.
        this.position.add(x, y);

    }

    public abstract List<Position> getValidMoves();

}
