public class NumberCube {
    public static void main(String[] args) {
        int numTosses = 15;
        int tosses[] = getCubeTosses(numTosses);

        for (int i = 0; i < numTosses; i++) {
            System.out.print(i + (i > 9 ? " " : "  "));
        }
        System.out.println();
        for (int toss : tosses) {
            System.out.print(toss + "  ");
        }

        System.out.println("\nThe longest run is at index: " + getLongestRun(tosses));
    }

    public static int toss() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int[] getCubeTosses(/* NumberCube cube, */ int numTosses) {
        int tosses[] = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            tosses[i] = /* cube. */ toss();
        }
        return tosses;
    }

    public static int getLongestRun(int[] values) {
        int index = 0, runLength = 1, prevLength = 0, prevCell = 0;
        for (int i = 0; i < values.length; i++) {
            if (prevCell == values[i]) {
                runLength += 1;
            } else {
                if (runLength > prevLength) {
                    prevLength = runLength;
                    index = i - runLength;
                }
                prevCell = values[i];
                runLength = 1;
            }
        }
        return index;
    }
}