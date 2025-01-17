// Full Name: Sandra S Thadathil
// ID No: B00939988

public class FastPiece extends Piece {

    //constructor
    public FastPiece(String name, String color, Position point) {
        super(name, color, point);

    }

    // toString method that returns the piece's details in the format name, color and F.
    public String toString() {
        return super.toString() + "F";
    }

}
