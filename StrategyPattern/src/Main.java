public class Main {
    public static void main(String[] args) {
        String PromotionKey="CASHBACK";
        PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(PromotionKey));
        promotionActivity.execute();
    }
}
