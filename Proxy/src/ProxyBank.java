import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private RealBank bank=new RealBank();
    private static List<String> bankClients;
    static{
        bankClients=new ArrayList<>();
        bankClients.add("James");
        bankClients.add("ruby");
        bankClients.add("Lucy");
    }
    @Override
    public void withdrawMoney(String clientName) throws Exception{
        if(bankClients.contains(clientName.toLowerCase())){
            throw new Exception("Access Denied! You are not who you say you are!");
        }
        bank.withdrawMoney(clientName);
    }
}
