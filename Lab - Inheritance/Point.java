public class Point {
    private int x, y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public double getSlope(Point p) {
        if (this.x == p.x) {
            return Integer.MIN_VALUE;
        }
        else
        {
            return (double) (p.y - this.y) / (double) (p.x - this.x);
        }
    }

    public double getDist(Point p) { 
        return (Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2)));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
