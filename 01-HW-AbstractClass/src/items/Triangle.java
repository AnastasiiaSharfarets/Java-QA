package items;

import items.Figure;

public class Triangle extends Figure {

    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return length * length * Math.sqrt(3) / 4;
    }

    @Override
    public double calcPerimeter() {
        return 3 * length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                '}';
    }
}
