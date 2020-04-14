public class BattercakeTest {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake=new BaseBattercake();
        batterCake=new EggDecorator(batterCake);
        batterCake=new EggDecorator(batterCake);
        batterCake=new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg()+",总价： "+batterCake.getPrice());
    }
}
