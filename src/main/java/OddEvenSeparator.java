import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    List<Integer> num_list = new ArrayList<Integer>();

    public void addNumber(int num) {
        num_list.add(num);
    }

    public void even(){
        List<Integer> tmp = num_list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(tmp);
    }

    public void odd(){
        List<Integer> tmp = num_list.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(tmp);
    }
}
