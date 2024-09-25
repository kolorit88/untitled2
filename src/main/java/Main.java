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

        Table table1 = new Table(3, 2);
    }
}

