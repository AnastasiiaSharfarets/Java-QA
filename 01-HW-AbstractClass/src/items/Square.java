package items;

import items.Figure;

public class Square extends Figure {

    public Square(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return length * length;
    }

    @Override
    public double calcPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
