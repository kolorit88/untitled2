import com.sun.jdi.IntegerType;

public class Main {
    public static void main(String[] args) {
        Button b1 = new Button();
        b1.click();
        b1.click();

        Balance balance = new Balance();
        balance.addLeft(3);
        balance.addRight(5);
        balance.result();

        balance.addRight(1);
        balance.result();

        balance.addLeft(1);
        balance.result();

        Bell bell = new Bell();
        bell.sound();

        Table table1 = new Table(4, 3);

        System.out.println(table1.getValue(1, 2));
        table1.setValue(1, 2, 999);
        System.out.println(table1.getValue(1, 2));

        System.out.println(table1.rows());
        System.out.println(table1.cols());
        System.out.println(table1.toString());
        System.out.println(table1.average());

        OddEvenSeparator sep = new OddEvenSeparator();
        for (int i = 0; i < 11; i++) {
            sep.addNumber(i);
        }
        sep.even();
        sep.odd();
    }
}

