package model;

public class BankAccount {
    private int id;
    private double balance;
    private String client;


    /**
     * CONSTRUCTORS
     */
    public BankAccount()
    {
        id = 0;
        balance = 0;
        client = "";
    }

    public BankAccount(int id, double balance, String client) {
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    /**
     * TOSTRING()
     */

    @Override
    public String toString() {
        return "bankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", client='" + client + '\'' +
                "\n";
    }

    /**
    METHOD : ALLOWS THE USER TO DEPOSIT MONEY INTO THE BANK ACCOUNT
     */
    public String deposit (double money)
    {
        balance+= money;
        return "Great, you've successfully deposited $ "+ money+ " , and now you have $"+ balance + " in your account.";
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
            message = "Great, you've successfully extracted $ "+ draw + " , and now you have $"+ balance+ " in your account";
        }
        else {
            message = "Insufficient funds.";
        }
        return message;
    }
}
