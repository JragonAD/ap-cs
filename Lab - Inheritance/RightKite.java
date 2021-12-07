public class RightKite extends Kite {
    public RightKite(int... coords) {
        super(coords);
        isShape(isRtKt(), "right kite");
    }

    public boolean isRtKt() {
        return isKite() && hasRight();
    }
}
