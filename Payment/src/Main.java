public class Main {
    public static void main(String[] args) {
        Order order=new Order("1","2020022910012",324.25);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
