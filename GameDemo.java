
// GameDemo class reads commands from the console, move the pieces and display the game board.

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {

        System.out.println("Enter a command (type help for details): ");

        Scanner in = new Scanner(System.in);

        int xCoordinate;
        int yCoordinate;

        // while loop to read inputs from the console
        while(in.hasNext()) {
            String command;
            String type1 = "";

            command = in.next();

            // taking necessary actions based on the command read from console.
            if (command.equals("help")) {
                System.out.println("Possible commands are as follows");
                System.out.println("create location [fast][flexible]: Creates a new piece");
                System.out.println("move location direction [spaces]: Moves a piece");
                System.out.println("print: Displays the board");
                System.out.println("help: Displays help");
                System.out.println("exit: Exits the program");

            } else if (command.equals("create")) {
                xCoordinate = in.nextInt();
                yCoordinate = in.nextInt();

                Position position = new Position(xCoordinate, yCoordinate);

                type1 = in.nextLine();

                String name, color;
                System.out.println("Input a name for the new piece");
                name = in.next();
                System.out.println("Input a color for the new piece");
                color = in.next();

                Board board = new Board();

                // checking the command and creating the correct type of piece by calling the addPiece method.
                if (type1.equals(" slow")) {
                   SlowPiece slowPiece = new SlowPiece(name, color, position);
                   board.addPiece(slowPiece);
                } else if (type1.equals(" fast")) {
                    FastPiece fastPiece = new FastPiece(name, color, position);
                    board.addPiece(fastPiece);
                } else if (type1.equals(" slow flexible")){
                    SlowFlexible slowFlexible = new SlowFlexible(name, color, position);
                    board.addPiece(slowFlexible);
                } else if (type1.equals(" fast flexible")) {
                    FastFlexible fastFlexible = new FastFlexible(name, color, position);
                    board.addPiece(fastFlexible);
                } else {
                    SlowPiece slowPiece = new SlowPiece(name, color, position);
                    board.addPiece(slowPiece);
                }

            } else if (command.equals("print")) {
                Board.displayBoard();
                System.out.println();
            } else if (command.equals("move")) {
                xCoordinate = in.nextInt();
                yCoordinate = in.nextInt();
                Board board = new Board();

                //checking if the move is valid, if valid calls the movePiece method in Board class to move the piece.
                if (Board.board[xCoordinate - 1][yCoordinate - 1] != null) {
                    Piece piece = Board.board[xCoordinate - 1][yCoordinate - 1];

                    String direction = in.next();
                    int steps = 1;

                    if (in.hasNextInt()) {
                        steps = in.nextInt();
                        board.movePiece(piece,direction, steps);
                    } else {
                        board.movePiece(piece, direction, 1);
                    }

                } else {
                    System.out.println("Error: no piece at (" + xCoordinate + ", " + yCoordinate + ")");
                }

            } else if (command.equals("exit")) {
                System.out.println("Done");
                break;
            }
            System.out.println("Enter a command (type help for details): ");
        }
    }

}


