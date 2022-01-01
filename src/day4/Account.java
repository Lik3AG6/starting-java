package day4;

public class Account {

    // accountNumber
    // accountHolderName
    // balance

    private final float INTEREST_RATE = 0.05f;
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;



    // addBalance
    // transferBalance

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
    // addInterest
    public void addInterest(Account account){
        double interest = (account.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Principal Amount: " + account.getAccountBalance());
        System.out.println("Interest Amount: " + interest);
        account.setAccountBalance(account.getAccountBalance() + interest);
        System.out.println("Amount with interest: " + account.getAccountBalance());
    }

}

