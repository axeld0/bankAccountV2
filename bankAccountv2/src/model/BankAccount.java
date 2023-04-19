package model;

public class BankAccount {
    private int id;
    private double balance;
    private Client client;


    /**
     * CONSTRUCTORS
     */
    public BankAccount()
    {
        id = 0;
        balance = 0;
        client = new Client();
    }

    public BankAccount(int id, double balance, Client client) {
        this.id = id;
        this.balance = balance;
        this.client = client;
    }

    /**
     * GETTERS AND SETTERS
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * TOSTRING()
     */

    @Override
    public String toString() {
        return "BankAccount :\n" +
                "\tid : " + id +
                ",\n\tbalance : " + balance +
                ",\n\tclient : | "  + client +
                " \n";
    }

    /**
    METHOD : ALLOWS THE USER TO DEPOSIT MONEY INTO THE BANK ACCOUNT
     */
    public String deposit (double money)
    {
        balance+= money;
        return "Great,"+client.getName()+", you've successfully deposited $ "+ money+ " , and now you have $"+ balance + " in your account.";
    }

    /**
     * METHOD : ALLOWS THE USER TO WITHDRAW MONEY.
     */
    public String withdraw (double draw)
    {
        String message;
        if(balance-draw >= -2000)
        {
            balance-=draw;
            message = "Great, "+client.getName()+ " ,successfully extracted $ "+ draw + " , and now you have $"+ balance+ " in your account";
        }
        else {
            message = "Insufficient funds.";
        }
        return message;
    }


}
