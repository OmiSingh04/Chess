package pieces;

import util.Position;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece{
    public Rook(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public List<Position> getValidMoves() {//to render the available spaces the piece can take when its selected.
        List<Position> list = new ArrayList<>();


        return list;
    }
}
