public class main {
    public static void main(String[] args)
    {
        BankAccount harry = new BankAccount("Harry Potter", 4000.0);
        BankAccount ron = new BankAccount();
        ron.setBalance(500.0);
        ron.setOwner("Ronald Weasley");
        BankAccount hermi = new BankAccount("Hermione Granger",5000.0);
        BankAccount draco = new BankAccount("Draco Malfoy", 500000.0);
        BankAccount rubeus_hagrid = new BankAccount("Rubeus Hagrid", 5000.0 );

        Bank gringott = new Bank("Gringotts");

        gringott.addAccount(harry);
        gringott.addAccount(ron);
        gringott.addAccount(hermi);
        gringott.addAccount(draco);
        gringott.addAccount(rubeus_hagrid);


     gringott.totalValue();







        System.out.println( harry.getOwner() + " has " + harry.getBalance() + " on his bank account");
        harry.deposit(567.8);
        System.out.println( harry.getOwner() + " has " + harry.getBalance() + " on his bank account");
        harry.take(452.8);
        System.out.println( harry.getOwner() + " has " + harry.getBalance() + " on his bank account");

        System.out.println( ron.getOwner() + " has " + ron.getBalance() + "  on his bank account");









    }
}
