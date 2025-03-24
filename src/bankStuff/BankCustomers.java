package bankStuff;
import java.util.ArrayList;

public class BankCustomers {

    private static ArrayList<BankAccount> accountsList;

    public static void addAccount(BankAccount account){
        accountsList = new ArrayList<>();
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount bankAccount : accountsList)
            System.out.println(bankAccount.getAccountNumber() + bankAccount.getAccountHolderName() + bankAccount.getBalance());
    }

    public static BankAccount findAccount(String accountNumber) {
        for (BankAccount banksAccount : accountsList) {
            if (banksAccount.getAccountNumber().equals(accountNumber))
                System.out.println(banksAccount.getAccountNumber()+" , "+banksAccount.getAccountHolderName()+" , "+banksAccount.getBalance());
            else
                System.out.println("couldn't find this account.");
        }
        return null;
    }

}
