package geometry2d;

import Exceptions.IncorrectRadius;

public class Circle implements Figure {
    double radius = -1;

    public Circle(double radius_) {
        radius = radius_;
    }

    public double area(){
        if (radius >= 0){
            return radius*radius*3.14;
        }
        else{
            throw new IncorrectRadius("Incorrect radius");
        }
    }

    public String toStringFigure() {
        if (radius >= 0){
            return "Circle: " + radius;
        }
        else {
            throw new IncorrectRadius("Incorrect radius");
        }
    }
}