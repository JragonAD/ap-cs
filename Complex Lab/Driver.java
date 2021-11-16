public class Driver {
    public static void main(String args[]) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);
        Complex c3 = c1.add(c2);
        Complex c4 = c1.sub(c2);
        Complex c5 = c1.mult(c2);
        Complex c6 = c1.divide(c2);
        System.out.println("The two complex numbers added together is " + c3.toString());
        System.out.println("The two complex numbers subtracted together is " + c4.toString());
        System.out.println("The two complex numbers multiplied together is " + c5.toString());
        System.out.println("The two complex numbers divided together is " + c6.toString());
        System.out.println("The two complex numbers are equal: " + c1.equals(c2));
    }
}
