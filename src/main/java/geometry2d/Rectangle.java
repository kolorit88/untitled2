package geometry2d;

public class Rectangle implements Figure {
    public double a, b;

    public Rectangle(double a_, double b_) {
        a = a_;
        b = b_;
    }

    public double area(){
        return a*b;
    }

    public String toStringFigure() {
        return "Rectangle: " + a + ";" + b;
    }
}