package example1;

public class CheckInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住！别人不能入住！");
    }
}
