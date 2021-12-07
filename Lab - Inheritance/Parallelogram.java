public class Parallelogram extends Quadrilateral {
    public Parallelogram(int... coords) {
        super(coords);
        isShape(isParallelogram(), "parallelogram");
    }

    public boolean isParallelogram() {
        return dists[0] == dists[2] && dists[1] == dists[3];
    }
}
