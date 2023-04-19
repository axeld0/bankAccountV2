import model.BankAccount;
import model.Client;

public class Main {



    public static void main(String[] args) {

        String [] record = new String[10];

        //a.
        Client newClient = new Client(36617165, "Axel Dominguez", "Male");
        System.out.println(newClient);
        //b.
       BankAccount newAccount = new BankAccount(1,10000, newClient);
       System.out.println("Great, you've successfully created a bank account and now you have $ "+newAccount.getBalance()+ " in your account.\n");
       System.out.println(newAccount);
        //c.
        record[0] = newAccount.deposit(1000);
        record [1] = newAccount.withdraw(2000);
        //e.
        for(int i = 0 ; i < 10 ; i++)
        {
            if(record[i] != null){System.out.println((i+1)+")"+record[i]);}
        }






    }

}