package day4;

public class Account {

    // accountNumber
    // accountHolderName
    // balance

    private final float INTEREST_RATE = 0.05f;
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;



    public float getINTEREST_RATE() {
        return INTEREST_RATE;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // deposit
    public void deposit(Account account, double amount){
        this.accountBalance += amount;
    }

    // transferBalance
    public void transferBalance(Account fromAccount ,Account toAccount, double amountToBeTransferred){
        fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amountToBeTransferred);
        toAccount.setAccountBalance(toAccount.getAccountBalance() + amountToBeTransferred);
    }

    // addInterest
    public void addInterest(Account account){
        double interest = (account.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Principal Amount: " + account.getAccountBalance());
        System.out.println("Interest Amount: " + interest);
        account.setAccountBalance(account.getAccountBalance() + interest);
        System.out.println("Amount with interest: " + account.getAccountBalance());


    }

}

