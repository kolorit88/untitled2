
public class Bell {
    boolean bing = true;
    public void sound(){
        if (bing){
            System.out.println("bing");
        }
        else{
            System.out.println("bong");
        }
        bing = !bing;
    }
}
