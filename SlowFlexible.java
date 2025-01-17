

public class SlowFlexible extends SlowPiece {

    //constructor
    public SlowFlexible (String name, String color, Position point) {
        super(name,color, point);

    }

    // toString method that returns the piece's details in the format name, color and SF.
    public String toString() {
        return (super.toString() + "F");
    }

}
