public class Zeros {
    public static void main(String[] args) {
        setZeros(new int[] {0, 1, 6, 0, 5, 1});
    }

    public static int findZeros (int[] A, int pos) {
        for (int k = pos; k < A.length; k++) {
            if (A[k] == 0) {
                return k;
            }
        }
        return -1;
    }

    public static void setZeros (int[] A) {
        int first, second; 
        first = findZeros (A, 0); 
        if (first != -1 && first < A.length - 1) {
            second = findZeros (A, first + 1);
            if (second != -1) {
                for (int i = first + 1; i < second; i++) {
                    A[i] = 0;
                }
            }
        }
        
        for (int cell : A) {
            System.out.print(cell + " ");
        }
    }
}