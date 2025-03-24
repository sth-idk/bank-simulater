import bankStuff.BankAccount;
import bankStuff.BankCustomers;
import bankStuff.SavingAccount;
import bankStuff.TransactionAccount;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankAccount savingsAccount1 = new SavingAccount("2398430049203454", "savings dude 1", 230.0);
        BankCustomers.addAccount(savingsAccount1);
        BankAccount savingsAccount2 = new SavingAccount("2394110298394376", "savings dude 2", 400.0);
        BankCustomers.addAccount(savingsAccount2);
        BankAccount savingsAccount3 = new SavingAccount("9034932827463512", "savings dude 3", 56.0);
        BankCustomers.addAccount(savingsAccount3);

        BankAccount transactionAccount1 = new TransactionAccount("93837856487302098", "transaction dude 1", 90.0);
        BankCustomers.addAccount(transactionAccount1);
        BankAccount transactionAccount2 = new TransactionAccount("333292928743803", "transaction dude 2", 34.0);
        BankCustomers.addAccount(transactionAccount2);
        BankAccount transactionAccount3 = new TransactionAccount("9090898978786767", "transaction dude 3", 730.0);
        BankCustomers.addAccount(transactionAccount3);


        BankCustomers.findAccount("9090898978786767");
        BankCustomers.findAccount("2398430049203404");

        System.out.println();

        System.out.println(savingsAccount2.getBalance());
        savingsAccount2.deposit(86.0);
        System.out.println(savingsAccount2.getBalance());
        savingsAccount2.calculateInterest();
        System.out.println(savingsAccount2.getBalance());

        System.out.println();

        transactionAccount1.withdraw(200.0);
        transactionAccount1.calculateInterest();
        System.out.println(transactionAccount1.getBalance());

        System.out.println();

        transactionAccount1.withdraw(100.0);
        transactionAccount1.withdraw(900.0);
        transactionAccount1.withdraw(-28.0);

        System.out.println();

        savingsAccount3.withdraw(60.0);
        savingsAccount3.withdraw(100.0);
        savingsAccount3.withdraw(-20.0);



    }
}