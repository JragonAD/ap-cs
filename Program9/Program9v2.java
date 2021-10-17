import java.util.Scanner;

/* A  two dimensional array (that has 6 rows and 7 columns) as a a class variable 
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
    static int map[][] = new int[6][7], player;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            player = 1;
            resetBoard();
            gameLoop();
        } while (keepPlaying());
    }

    public static void gameLoop() {
        while (checkHelper()) {
            displayBoard();
            dropPiece();
            swapPlayer();
        }
        displayBoard();
        swapPlayer();
        System.out.println("\nPlayer " + Integer.toString(player) + " wins!");
    }

    public static void swapPlayer() {
        player = player == 1 ? 2 : 1;
    }

    public static boolean checkHelper() {
        boolean checkWin = horizontalCheck() || verticalCheck() || diagonalCheck();
        if (!checkWin) {
            flipBoard();
            checkWin = diagonalCheck();
            flipBoard();
        }
        return !checkWin;
    }

    public static boolean diagonalCheck() {
        int previous, counter = 0;
        for (int i = 0; i < 3; i++) {
            previous = 0;
            for (int j = i; j < 6; j++) {
                if (previous == map[i + (j - i)][j] && previous != 0) {
                    counter += 1;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[i + (j - i)][j];
            }
        }
        for (int i = 5; i > 2; i--) {
            previous = 0;
            for (int j = i + 1; j > 0; j--) {
                if (previous == map[i - (i - (j - 1))][j] && previous != 0) {
                    counter += 1;
                    if (counter == 4) {
                        return true;
                    }
                } else {
                    counter = 1;
                }
                previous = map[i - (i - (j - 1))][j];
            }
        }
        return false;
    }

    /*
     * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 0 0 1 2 0 0 0 0 0 2 2 2 0 0 0 0 1 1 1 0
     * 0 1 1
     * 
     * Player 1 wins! Would you like to play another game? (y/n):
     */

    public static boolean horizontalCheck() {
        int previous, counter = 1;
        for (int i = 0; i < map.length; i++) {
            previous = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (previous == map[i][j] && previous != 0) {
                    counter += 1;
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

    public static boolean verticalCheck() {
        int previous, counter = 1;
        for (int i = 0; i < map[0].length; i++) {
            previous = 0;
            for (int j = 0; j < map.length; j++) {
                if (previous == map[j][i] && previous != 0) {
                    counter += 1;
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

    /*
     * public static boolean linearCheck() { int previousx, previousy, counterx,
     * countery; for (int i = 0; i < map.length; i++) { previousx = counterx = 0;
     * for (int j = 0; j < map[i].length; j++) { if (map[i][j] == previousx) {
     * counterx++; if (counterx == 4) { return true; } } } }
     * 
     * 
     * 
     * return false; }
     */

    public static int getInput() {
        System.out.print(
                "Player " + Integer.toString(player) + ", enter the column you would like to drop your piece in: ");
        int column = sc.nextInt();
        if (column < 0 || column > map[0].length) {
            return getInput();
        }
        return column - 1;
    }

    public static void dropPiece() {
        int column = getInput();
        for (int i = map.length - 1; i >= 0; i--) {
            if (map[i][column] == 0) {
                map[i][column] = player;
                return;
            }
        }
        dropPiece();
    }

    public static void displayBoard() {
        for (int row[] : map) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
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
        System.out.println("Would you like to play another game? (y/n): ");
        return sc.next().charAt(0) == 'y' ? true : false;
    }
}