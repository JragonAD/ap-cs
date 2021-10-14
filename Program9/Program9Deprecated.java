import java.util.Scanner;

public class Program9Deprecated {
    static int map[][] = new int[8][8], originalMap[][] = map;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        gameLoop();
    }

    public static void gameLoop() {
        System.out.println("");
    }

    public static void displayMap() {
        for (int row[] : map) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int check() {
        int checkWin[] = new int[4];
        checkWin[0] = linearCheck();
        rotateBoard();
        checkWin[1] = linearCheck();
        resetBoard();

        checkWin[2] = diagonalCheck();
        flipBoard();
        checkWin[3] = diagonalCheck();
        resetBoard();
        
        for (int cell : checkWin) {
            if (cell != -1) {
                return cell;
            }
        }
        return -1;
    }

    public static int diagonalCheck() {
        int counter = 1, previous;
        for (int i = 0; i <= 4; i++) {
            previous = -1;
            for (int j = 0; j < 8 - i; j++) {
                counter = previous == map[i + j][j] ? counter + 1 : 1;
                if (counter == 4)
                {
                    return previous;
                }
                previous = map[i + j][j];
            }
        }
        return -1;
    }

    public static int linearCheck() {
        int counter = 1, previous;
        for (int row[] : map) {
            previous = -1;
            for (int cell : row) {
                counter = previous == cell ? counter + 1 : 1;
                if (counter == 4)
                {
                    return previous;
                }
                previous = cell;
            }
        }
        return -1;
    }

    public static void flipBoard() {
        int tempMap[][] = map;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tempMap[i][j] = map[j][i];
            }
        }
        originalMap = map;
        map = tempMap;
    }

    public static void rotateBoard() {
        int tempMap[][] = map;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tempMap[i][j] = map[7 - j][i];
            }
        }
        originalMap = map;
        map = tempMap;
    }

    public static void resetBoard() {
        map = originalMap;
    }
}
