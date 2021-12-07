public class Rectangle extends Parallelogram {
    public Rectangle(int... coords) {
        super(coords);
        isShape(isRectangle(), "rectangle");
    }

    public boolean isRectangle() {
        return isParallelogram() && isPerp(slopes[0], slopes[1]);
    }
}
