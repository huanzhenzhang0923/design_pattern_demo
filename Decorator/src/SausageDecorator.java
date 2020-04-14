public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }
}
