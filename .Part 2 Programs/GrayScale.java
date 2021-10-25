public class GrayScale {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    private static int[][] pixelValues = {
        {255, 184, 178, 84, 135}, 
        {84, 255, 255, 130, 84}, 
        {78, 255, 0, 0, 78}, 
        {84, 130, 255, 130, 84}
    };

    public static void main(String[] args) {
        System.out.println(countWhitePixels());
        processImage();
        for (int row[] : pixelValues) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static int countWhitePixels() {
        int counter = 0;
        for (int row[] : pixelValues) {
            for (int cell : row) {
                if (cell == WHITE) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void processImage() {
        for (int i = 0; i < pixelValues.length - 2; i++) {
            for (int j = 0; j < pixelValues[i].length - 2; j++) {
                pixelValues[i][j] = pixelValues[i][j] - pixelValues[i + 2][j + 2] > 0
                        ? pixelValues[i][j] - pixelValues[i + 2][j + 2]
                        : BLACK;
            }
        }
    }

}
