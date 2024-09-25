public class Balance {
    private int left = 0;
    private int right = 0;

    public void addRight(int weight) {
        right = weight;
    }

    public void addLeft(int weight) {
        left = weight;
    }

    public void result(){
        if(left > right){
            System.out.println("L");
        }
        else if(right > left){
            System.out.println("R");
        }
        else{
            System.out.println("=");
        }
    }
}
