package bankStuff;

public abstract class BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber , String accountHolderName , double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if(amount < 0)
            System.out.println("this amount is invalid.");
        else {
            balance += amount;
            System.out.println(amount + " has been added to your bank account.");
        }
    }

    public void withdraw(double amount){
        if(amount < 0)
            System.out.println("this amount is invalid.");
        else {
            balance -= amount;
            System.out.println(amount + " has been taken from your bank account.");
        }

    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}
