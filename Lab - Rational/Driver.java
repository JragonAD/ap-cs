public class Driver {
    public static void main(String args[]) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 5);
        Rational r3 = r1.add(r2);
        Rational r4 = r1.sub(r2);
        Rational r5 = r1.mult(r2);
        Rational r6 = r1.divide(r2);
        System.out.println(r3.toString());
        System.out.println(r4.toDouble());
        System.out.println(r5.toString());
        System.out.println(r6.toDouble());
        System.out.println(r1.equals(r2));
    }
}
