public class Driver {
    public static void main(String args[]) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 5);
        Rational r3 = r1.add(r2);
        System.out.println(r3.toString());
    }
}
