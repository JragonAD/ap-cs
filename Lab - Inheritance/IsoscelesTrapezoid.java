public class IsoscelesTrapezoid extends Trapezoid {
    public IsoscelesTrapezoid(int... coords) {
        super(coords);
        isShape(isIsoTrape(), "isosceles trapezoid");
    }

    public boolean isIsoTrape() {
        return (slopes[1] == slopes[3] && dists[0] == dists[2])
                || (slopes[0] == slopes[2] && dists[1] == dists[3]);
    }
}
