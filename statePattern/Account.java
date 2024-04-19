public class Account{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        accountState = new ActiveState();
        
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void activate() {
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() {
        accountState.close(this);
    }

    public void deposit(double amount){
        accountState.deposit(amount, this);
        AccountToString();
    }

    public void withdraw(double amount){
        accountState.withdraw(amount, this);
        AccountToString();
    }


    private void AccountToString(){
        System.out.println("\nDisplaying account details");
        System.out.println("Account number: " + accountNumber);
        System.out.println("New Balance: " + balance);
        System.out.println();
    }
    
}