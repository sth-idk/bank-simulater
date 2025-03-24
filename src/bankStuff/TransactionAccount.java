package bankStuff;


public class TransactionAccount extends BankAccount{

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber , String accountHolderName , double initialBalance){
        super(accountNumber,accountHolderName,initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for this account.");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance + overDraftLimit)
            System.out.println("this amount is invalid.");
        else
            super.withdraw(amount);
    }
}
