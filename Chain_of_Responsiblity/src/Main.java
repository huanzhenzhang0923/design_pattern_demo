import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        CEOPurchasePower ceoPurchasePower=new CEOPurchasePower();
        DirectorPurchasePower directorPurchasePower=new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower=new ManagerPurchasePower();
        directorPurchasePower.setSuccessor(ceoPurchasePower);
        managerPurchasePower.setSuccessor(directorPurchasePower);

        while(true){
            System.out.println("Enter the amount to check the who should approve the budget");
            System.out.println(">>");
            double d=Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            managerPurchasePower.processRequest(new PurchaseRequest(d,"By Stuff"));
        }
    }
}
