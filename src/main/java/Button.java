public class Button {
    int click_count = 0;

    public void click(){
        click_count += 1;
        System.out.println(click_count);
    }
}