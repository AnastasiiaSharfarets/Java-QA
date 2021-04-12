package app;

import items.Circle;
import items.Figure;
import items.Square;
import items.Triangle;

public class FigureApp {
    public static void main(String[] args) {
        Figure circle = new Circle(10.09);
        System.out.println(circle);
        System.out.println("Square of the circle: "+ circle.calcSquare());
        System.out.println("Perimeter of the circle: "+ circle.calcPerimeter());
        System.out.println("==========================================");

        Figure triangle = new Triangle(55.5);
        System.out.println(triangle);
        System.out.println("Square of the triangle: "+ triangle.calcSquare());
        System.out.println("Perimeter of the triangle: "+ triangle.calcPerimeter());
        System.out.println("==========================================");

        Figure square = new Square(100.2);
        System.out.println(square);
        System.out.println("Square of the square =): "+ square.calcSquare());
        System.out.println("Perimeter of the square: "+ square.calcPerimeter());
        System.out.println("==========================================");

    }
}
