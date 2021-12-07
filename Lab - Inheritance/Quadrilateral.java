import java.text.DecimalFormat;

public class Quadrilateral {
    protected Point points[] = new Point[4];
    protected double[] slopes = new double[4], dists = new double[4], diags = new double[2];
    private DecimalFormat df = new DecimalFormat("0.000");

    public Quadrilateral(int... coords) {
        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                points[i] = new Point(coords[i * 2], coords[i * 2 + 1]);
            }
            if (i != 0) {
                slopes[i - 1] = points[i - 1].getSlope(points[i % 4]);
                dists[i - 1] = points[i - 1].getDist(points[i % 4]);
            }
            if (i > 2) {
                diags[(i + 1) % 2] = points[i - 3].getSlope(points[i - 1]);
            }
        }
    }

    protected boolean isPerp(double slope1, double slope2) {
        boolean ret = false;
        if (slope1 * slope2 == -1) {
            ret = true;
        } else if ((slope1 == 0 || slope1 == Integer.MIN_VALUE)
                && (slope2 == 0 || slope2 == Integer.MIN_VALUE)) {
            ret = true;
        }
        return ret;
    }

    protected boolean hasRight() {
        return isPerp(slopes[0], slopes[1]) || isPerp(slopes[1], slopes[2]) || isPerp(slopes[2], slopes[3]) || isPerp(slopes[3], slopes[0]);
    }

    protected void isShape(boolean value, String name) {
        System.out.println("This shape is " + (value ? "" : "not ") + "a " + name + ".");
    }

    public String toString() {
        String out = "Point\tSlope\tDist\tDiag";
        for (int i = 0; i < 4; i++) {
            out += "\n" + points[i] + "\t";
            out += (slopes[i] == Integer.MIN_VALUE ? "INF" : df.format(slopes[i])) + "\t";
            out += df.format(dists[i]);
            if (i < 2) {
                out += "\t" + df.format(diags[i]);
            }
        }
        return out + "\n";
    }
}
