import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccount> allAccounts = new ArrayList<>();
    private double balval = 0;

    public Bank (String Name) {
        this.name = name;
    }

    //add method
    public void addAccount (BankAccount account) { allAccounts.add(account);}

    public void totalValue(){
        for (BankAccount account: allAccounts) {
            balval = account.getBalance() + balval;
        }
        System.out.println("the total amount is = "+balval);
    }


}
