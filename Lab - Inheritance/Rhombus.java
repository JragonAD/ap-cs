public class Rhombus extends Parallelogram {
    public Rhombus(int... coords) {
        super(coords);
        isShape(isRhombus(), "rhombus");
    }

    public boolean isRhombus() {
        return isParallelogram() && isPerp(diags[0], diags[1]);
    }
}
