import model.BankAccount;
import model.Client;

public class Main {

    public static void main(String[] args) {

        //b.
       ATM newATM = new ATM();
       Client newClient = new Client(36617165, "Axel Dominguez", "Male");
       newATM.createAccount(newClient.getName(),10000);
        //c.




    }
}