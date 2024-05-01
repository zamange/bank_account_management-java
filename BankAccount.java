public class BankAccount {
    private String accountNumber;
    private double balance;


    //constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //methods
    public void deposit (double amount){
        if (amount>0){
            amount += balance;
            System.out.println(amount + " deposited successfully.");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " successfully withdrawn.");
        }
        else {
            System.out.println("Invalid amount.");
        }
    }

}
