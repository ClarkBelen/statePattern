public class ActiveState implements AccountState {


    @Override
    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance()+depositAmount);
        System.out.println("Deposited " + depositAmount);
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance()-withdrawAmount);
        System.out.println("Withdrew " + withdrawAmount);


    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
        
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
    
}
