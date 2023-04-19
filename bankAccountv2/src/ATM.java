import model.BankAccount;
import model.Client;

public class ATM {

    BankAccount[] operationsRegistry;


    public ATM()
    {
        operationsRegistry = new BankAccount[10];
    }


   public void createAccount(String client, double balance)
   {
       BankAccount newAccount = new BankAccount(1, balance, client);
       System.out.println("Great ," +newAccount.getClient()+", you've successfully created a bank account ,and now you have $"+ newAccount.getBalance()+ " in your account. ");
   }

   public void setOperationsRegistry{
        for(int i  = 0 ; i < 10 ; i++)
        {

        }
    }
}
