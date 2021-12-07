public class RightTrapezoid extends Trapezoid {
    public RightTrapezoid(int... coords) {
        super(coords);
        isShape(isRtTz(), "right trapezoid");
    }

    public boolean isRtTz() {
        return isTrapezoid() && hasRight();
    }
}
