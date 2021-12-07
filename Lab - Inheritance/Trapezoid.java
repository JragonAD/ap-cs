public class Trapezoid extends Quadrilateral{
    public Trapezoid(int... coords) {
        super(coords);
        isShape(isTrapezoid(), "trapezoid");
    }

    public boolean isTrapezoid() {
        return slopes[0] == slopes[2] || slopes[1] == slopes[3];
    }
}
