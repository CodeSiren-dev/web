// Full Name: Sandra S Thadathil
// ID No: B00939988

public class SlowPiece extends Piece {

    //constructor
    public SlowPiece(String name, String color, Position point) {
        super(name, color, point);

    }
    // toString method that returns the piece's details in the format name, color and S.
    public String toString() {
        return super.toString() + "S";
    }

}
