import Exceptions.IncorrectRadius;
import Exceptions.ObjectNot3d;
import geometry2d.*;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Button---");
        Button b1 = new Button();
        b1.click();
        b1.click();
        System.out.println("---------\n");

        System.out.println("---Balance---");
        Balance balance = new Balance();
        balance.addLeft(3);
        balance.addRight(5);
        balance.result();

        balance.addRight(1);
        balance.result();

        balance.addLeft(1);
        balance.result();
        System.out.println("---------\n");

        System.out.println("---Bell---");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        System.out.println("---------\n");

        System.out.println("---Table---");
        Table table1 = new Table(4, 3);
        System.out.println(table1);

        System.out.println(table1.getValue(1, 2));
        table1.setValue(1, 2, 1);
        table1.setValue(3, 3, 1);
        System.out.println(table1.getValue(1, 2));
        System.out.println(table1);

        System.out.println(table1.rows());
        System.out.println(table1.cols());
        System.out.println(table1.average());
        System.out.println("---------\n");

        System.out.println("---Separator---");
        OddEvenSeparator sep = new OddEvenSeparator();
        for (int i = 0; i < 11; i++) {
            sep.addNumber(i);
        }
        sep.even();
        sep.odd();
        System.out.println("---------\n");

        System.out.println("---Circle---");
        Circle round = new Circle(8.0);
        round.area();
        System.out.println(round);

        System.out.println("* Exception");
        Circle wrong_round = new Circle(-99);
        try {
            wrong_round.area();
        }
        catch (IncorrectRadius ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("---------\n");

        System.out.println("---Rectangle---");
        Rectangle rect = new Rectangle(5.0, 6.0);
        rect.area();
        System.out.println(rect);
        System.out.println("---------\n");

        System.out.println("---Cylinder---");
        Cylinder cylinder = new Cylinder(5.0, 5.0);
        System.out.println(cylinder.Volume());

        System.out.println("* Exception");
        Cylinder wrong_cylinder = new Cylinder(5.0, 0);
        try {
            wrong_cylinder.Volume();
        }
        catch (ObjectNot3d ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("---------\n");
    }
}

