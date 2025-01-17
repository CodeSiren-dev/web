// Full Name: Sandra S Thadathil
// ID No: B00939988

public class FastFlexible extends FastPiece {

    //Constructor
    public FastFlexible(String name, String color, Position point) {
        super(name,color, point);
    }

    // toString method that returns the piece's details in the format name, color and FF.
    public String toString() {
        return(super.toString() + "F");
    }

}

