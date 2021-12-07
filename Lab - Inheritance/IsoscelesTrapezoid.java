public class IsoscelesTrapezoid extends Trapezoid {
    public IsoscelesTrapezoid(int... coords) {
        super(coords);
        isShape(isIsoTrape(), "isosceles trapezoid");
    }

    public boolean isIsoTrape() {
        return (slopes[1] == slopes[3] && points[0].getDist(points[1]) == points[2].getDist(points[3]))
                || (slopes[0] == slopes[2] && points[1].getDist(points[2]) == points[3].getDist(points[4]));
    }
}
