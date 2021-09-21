public class BankAccount
{
    //declare the attributes of the bank account
    private String owner;
    private Double balance;

    //create default constructor

    public BankAccount() {}

    //constructor with attributes
    public BankAccount(String owner, Double balance)
    {
    this.setOwner(owner);
    this.setBalance(balance);
    }

    public static void add(BankAccount accounts) {
    }

    //set method for owner and Balance
    public void setOwner(String owner) {this.owner = owner;}
    public void setBalance(Double balance) {this.balance = balance;}

    //get method for owner and Balance
    public String getOwner() {return owner;}
    public Double getBalance() {return balance;}
    //
    public void deposit(Double addAmount) {balance += addAmount;}
    public void take(Double lessAmount) {balance -= lessAmount;}
}
