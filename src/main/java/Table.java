public class Table {
    public Table(int rows_, int cols_){
        int rows = rows_;
        int cols = cols_;
        int[] table_arr = new int[rows * cols];

        for(int i = 0; table_arr.length > i; i++){
            table_arr[i] = 0;
        }
    }


}
