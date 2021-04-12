package items;

public abstract class Figure {
    double length;

    public Figure(double length) {
        this.length = length;

    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract double calcSquare();

    public abstract double calcPerimeter();
}