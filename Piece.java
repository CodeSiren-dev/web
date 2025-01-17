

public class Piece {
    private String name, color;
    private Position point;

    //Constructor to initialize the instance variables
    public Piece (String name, String color, Position point) {
        this.name = name;
        this.color = color;
        this.point = point;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Position getPoint() {
        return point;
    }

    public void setPoint(Position point) {
        this.point = point;
    }

    // toString method that returns the piece's details in the format name and color.
    public String toString() {
        return (name + color);

    }

}
