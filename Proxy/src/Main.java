public class Main {
    public static void main(String[] args) {
        Bank bank=new ProxyBank();
        try {
            bank.withdrawMoney("Paul");
            bank.withdrawMoney("Ruby");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
