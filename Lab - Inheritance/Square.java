public class Square extends Rectangle {
    public Square(int... coords) {
        super(coords);
        isShape(isSquare(), "square");
    }

    public boolean isSquare() {
       return isRectangle() && dists[0] == dists[1];
    }
}