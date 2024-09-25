package geometry3d;
import Exceptions.IncorrectRadius;
import Exceptions.ObjectNot3d;
import geometry2d.*;



public class Cylinder{
    Circle footing;
    Rectangle height;

    public Cylinder(double radius, double height_) {
        footing = new Circle(radius);
        height = new Rectangle(height_, 0.0);
    }

    public double Volume() {
        if (footing.area() != 0 || height.a != 0) {
            return footing.area() * height.a;
        }
        else {
            throw new ObjectNot3d("The figure does not have enough axes of space");
        }

    }

}