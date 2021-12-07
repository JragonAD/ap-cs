public class Driver {
    public static void main(String[] args) {
        System.out.println(new Square(1, 1, 1, 3, 2, 3, 2, 1));
        System.out.println(new Rhombus(0, 0, 3, 4, 8, 4, 5, 0));
        System.out.println(new RightKite(-3, 0, 0, 3, 3, 0, 0, -3));
        System.out.println(new RightTrapezoid(-4, 0, -4, 3, 3, 3, 4, 0));
        System.out.println(new IsoscelesTrapezoid(-4, 0, -3, 3, 3, 3, 4, 0));
    }
}
