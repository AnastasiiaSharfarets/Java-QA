package items;

public class Circle extends Figure {

    public Circle(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return  3.14 * length * length / 4;
    }

    @Override
    public double calcPerimeter() {
        return 3.14 * length;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "length=" + length +
                '}';
    }
}
