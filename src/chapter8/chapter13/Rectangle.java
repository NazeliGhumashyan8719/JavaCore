package chapter8.chapter13;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четыреугольника.");
        return dim1 * dim2;
    }
}


