public class Program3 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, iterator = 1;
        for (int i = 0; i < 11; i++) {
            count1 += iterator;
            iterator *= -1;
            count2 += iterator; 
        }
        System.out.println(count1 - count2);


        for (int n = 50; n > 0; n = n / 2) {
            System.out.println(n); // 6
        }
    }
}