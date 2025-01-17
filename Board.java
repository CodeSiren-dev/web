// Full Name: Sandra S Thadathil
// ID No: B00939988

//Board class hold 8 * 8 game board and contains displayBoard(), addPiece() and movePiece() methods.
public class Board {
    public static Piece[][] board = new Piece[8][8];


    //Constructor to initialize the instance variables
    public Board() {
    }

    /*
     * displayBoard method - displays the game board.
     * @param None
     * @return None
     */
    public static void displayBoard() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] != null) {
                    System.out.printf("%-14s", board[i][j].toString()) ;
                } else {
                    System.out.printf("%-14s", "-");
                }

            }
            System.out.println();
        }
    }

    /*
     * addPiece method - add a piece to the game board in specified location.
     * @param - Position point
     * @return None
     */
    public void addPiece( Piece piece) {
        Position point = piece.getPoint();
        int xCoordinate = point.getxCoordinate();
        int yCoordinate = point.getyCoordinate();

        board[xCoordinate - 1][yCoordinate - 1] = piece;

    }

    /*
     * movePiece method - move a piece in the game board from a specified location if it is a valid move.
     * @param - Position point
     * @return None
     */
    public void movePiece(Piece piece, String direction, int steps) {
        Position point = piece.getPoint();
        int xCoordinate = point.getxCoordinate() - 1;
        int yCoordinate = point.getyCoordinate() - 1;

        piece = board[xCoordinate][yCoordinate];

        Piece temp = piece;

        //checking the direction and the type of piece (instance of) to make the correct move, also check if the move causes out of bounds.
        if (direction.equals("left")) {

            if ((yCoordinate - steps) >= 0) {

                //checking the steps and type to ensure only FastPiece can move one or more steps.
                if (steps >= 1 && piece instanceof FastPiece) {
                    board[xCoordinate][yCoordinate - steps] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved left by " + steps + " spaces.");

                } else if (steps == 1 && piece instanceof SlowPiece) {
                    board[xCoordinate][yCoordinate - steps] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved left by " + steps + " spaces.");
                } else {
                    System.out.println("Invalid move, Try again!");
                }

            } else {
                System.out.println("Out of bounds, cannot make the move. Try again!");
            }

        } else if (direction.equals("right")) {

            if ((yCoordinate + steps) <= 7) {

                //checking the steps and type to ensure only FastPiece can move one or more steps.
                if (steps >= 1 && piece instanceof FastPiece) {
                    board[xCoordinate][yCoordinate + steps] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved right by " + steps + " spaces.");
                } else if (steps == 1 && piece instanceof SlowPiece) {
                    board[xCoordinate][yCoordinate + steps] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved right by " + steps + " spaces.");
                } else {
                    System.out.println("Invalid move, Try again!");
                }

            } else {
              System.out.println("Out of bounds, cannot make the move. Try again!");
            }

        } else if (direction.equals("up")) {

            if ((xCoordinate -steps ) >= 0) {

                //checking the steps and type to ensure only a flexible piece can move up or down.
                if (steps >= 1 && piece instanceof FastFlexible) {
                    board[xCoordinate - steps][yCoordinate] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved up by " + steps + " spaces.");
                } else if (steps == 1 && piece instanceof SlowFlexible) {
                    board[xCoordinate - steps][yCoordinate] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved up by " + steps + " spaces.");
                } else {
                    System.out.println("Invalid move, Try again!");
                }

            } else {
              System.out.println("Out of bounds, cannot make the move. Try again!");
            }

        } else if (direction.equals("down")) {

            if ((xCoordinate + steps) <= 7) {

                //checking the steps and type to ensure only a flexible piece can move up or down.
                if (steps >= 1 && piece instanceof FastFlexible) {
                    board[xCoordinate + steps][yCoordinate] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved down by " + steps + " spaces.");
                } else if (steps == 1 && piece instanceof SlowFlexible) {
                    board[xCoordinate + steps][yCoordinate] = temp;
                    board[xCoordinate][yCoordinate] = null;
                    System.out.println("Piece at (" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + ")" +" moved down by " + steps + " spaces.");
                } else {
                    System.out.println("Invalid move, Try again!");
                }

            } else {
               System.out.println("Out of bounds, cannot make the move. Try again!");
            }

        }
    }

}












