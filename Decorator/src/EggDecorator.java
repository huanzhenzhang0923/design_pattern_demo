public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }
}
