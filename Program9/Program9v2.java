import java.util.Scanner;

/* 
A  two dimensional array (that has 6 rows and 7 columns) as a a class variable 
Two person game
User friendly game
Visually appealing?  
Are the directions clear to any user? 
Is it your own work??
Must have a minimum of three methods (other than the main method)
DIAGONAL CHECK 
Can your user chose to play again
*/

class Program9v2 {
    static int map[][] = new int[6][7], player, column;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Connect 4!");
        System.out.println("\nIn this 2 player game, you will compete with a friend to");
        System.out.println("see who can connect four of your game pieces in a row vertically,");
        System.out.println("horizontally, or diagonally. When prompted, drop your game piece");
        System.out.println("in the column of your choice.");
        System.out.println("\nGood luck, and have fun!");
        do {
            player = 1;
            resetBoard();
            gameLoop();
        } while (keepPlaying());
    }

    public static void gameLoop() {
        while (!(horizontalCheck() || newVerticalCheck() || diagonalCheck() | diagonalCheck())) {
            displayBoard();
            dropPiece();
            swapPlayer();
        }
        displayBoard();
        swapPlayer();
        System.out.println("\nPlayer " + (player == 1 ? "X" : "O") + " wins!");
    }

    public static void swapPlayer() {
        player = player == 1 ? 2 : 1;
    }

    public static boolean diagonalCheck() {
        int previous, counter = 1;
        flipBoard();

        for (int startRow = 0; startRow < 3; startRow++) {
            previous = 0;
            for (int curRow = startRow; curRow < map.length; curRow++) {
                if (previous == map[curRow][curRow - startRow] && previous != 0) {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[curRow][curRow - startRow];
            }
        }
        for (int startCol = 1; startCol < 4; startCol++) {
            previous = 0;
            for (int curCol = startCol; curCol < map[0].length; curCol++) {
                if (previous == map[curCol - 1][curCol] && previous != 0) {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[curCol - 1][curCol];
            }
        }
        return false;
    }

    public static boolean horizontalCheck() {
        int previous, counter = 1;
        for (int i = 0; i < map.length; i++) {
            previous = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (previous == map[i][j] && previous != 0) {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[i][j];
            }
        }
        return false;
    }

    public static boolean newVerticalCheck() {
        int previous = 0, counter = 1;
        for (int i = 0; i < map.length; i++) {
            if (previous == map[i][column] && previous != 0) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                counter = 1;
            }
            previous = map[i][column];
        }
        return false;
    }

    public static boolean deprecatedVerticalCheck() {
        int previous, counter = 1;
        for (int i = 0; i < map[0].length; i++) {
            previous = 0;
            for (int j = 0; j < map.length; j++) {
                if (previous == map[j][i] && previous != 0) {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[j][i];
            }
        }
        return false;
    }

    public static int getInput() {
        System.out.print(
                "Player " + (player == 1 ? "X" : "O") + ", enter the column you would like to drop your piece in: ");
        int column = sc.nextInt();
        if (column < 0 || column > map[0].length) {
            System.out.println("\nEnter a number between 1 and 7.");
            return getInput();
        }
        return column - 1;
    }

    public static void dropPiece() {
        column = getInput();
        for (int i = map.length - 1; i >= 0; i--) {
            if (map[i][column] == 0) {
                map[i][column] = player;
                return;
            }
        }
        System.out.println("\nThis column is full. Choose another column.");
        dropPiece();
    }

    public static void displayBoard() {
        String printI1[] = new String[6];
        for (int i = 0; i < map.length; i++) {
            printI1[i] = "│ ";
            for (int cell : map[i]) {
                printI1[i] += cell + " │ ";
            }
        }
        System.out.println("\n\t  Connect 4\n  1   2   3   4   5   6   7\n┌───┬───┬───┬───┬───┬───┬───┐\n"
                + String.join("\n├───┼───┼───┼───┼───┼───┼───┤\n", printI1).replace("0", " ").replace("1", "X")
                        .replace("2", "O")
                + "\n└───┴───┴───┴───┴───┴───┴───┘");
    }

    public static void flipBoard() {
        int tempBoard[][] = new int[6][7];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                tempBoard[i][j] = map[i][6 - j];
            }
        }
        map = tempBoard;
    }

    public static void resetBoard() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
    }

    public static boolean keepPlaying() {
        System.out.print("\nWould you like to play another game? (y/n): ");
        return sc.next().charAt(0) == 'y' ? true : false;
    }
}