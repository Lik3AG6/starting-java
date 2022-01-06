package day4;

public class BankEncapsulation {

    public static void main(String[] args) {

        Account account1 = new Account();
        //account1.accountNumber = "1";
        account1.setAccountNumber("1");
        //account1.accountHolderName = "ABC";
        account1.setAccountHolderName("ABC");
        //account1.accountBalance = 500;
        account1.setAccountBalance(500);

        Account account2 = new Account();
        //account2.accountNumber = "2";
        account2.setAccountNumber("2");
        //account2.accountHolderName = "Ram";
        account2.setAccountHolderName("Ram");
        //account2.accountBalance = 1000;
        account2.setAccountBalance(1000);

        // Interest calculation
        account1.addInterest(account1);

        System.out.println("****************** Before Transfer *****************");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1 : " + account1.getAccountBalance());

        // Transferring balance
        account2.transferBalance(account1, account2, double amountToBeTransferred: 1000);

        System.out.println("****************** Before Transfer *****************");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1 : " + account1.getAccountBalance());

    }




}

