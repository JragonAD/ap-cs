public class Kite extends Quadrilateral {
    public Kite(int... coords) {
        super(coords);
        isShape(isKite(), "kite");
    }

    public boolean isKite() {
        return ((dists[0] == dists[1] && dists[2] == dists[3] ||
                dists[3] == dists[0] && dists[1] == dists[2])) && isPerp(diags[0], diags[1]);
    }
}
