public class Table {
    private final int rows;
    private final int cols;
    int[] table_arr;

    public Table(int rows_, int cols_){
        rows = rows_;
        cols = cols_;
        table_arr = new int[rows * cols];

    }

    public int getValue(int row_num, int col_num){
        return table_arr[(cols * (row_num - 1)) + col_num - 1];

    }

    public void setValue(int row_num, int col_num, int value){
        table_arr[(cols * (row_num - 1)) + col_num - 1] = value;
    }

    public int rows(){
        return rows;
    }

    public int cols(){
        return cols;
    }

    public String toString(){
        StringBuilder tmp = new StringBuilder();
        String separator;
        for (int i = 0; i < table_arr.length; i++) {
            if ((i + 1) % cols == 0) {
                separator = "\n";
            }
            else {separator = ";";
            }

            tmp.append(table_arr[i]).append(separator);
        }
        return tmp.substring(0, tmp.length() - 1);
    }

    public double average(){
        double sum = 0;
        for (int j : table_arr) {
            sum += j;
        }
        return sum / (rows * cols);
    }

}
