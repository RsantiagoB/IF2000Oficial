package logic;

public class SINPEMobile {
    
    private Account originAccount;
    private Account destinationAccount;
    private double amount;
    
    public SINPEMobile(Account originAccount, Account destinationAccount, double amount) {
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }
    
    public Account getOriginAccount() {
        return originAccount;
    }
    
    public void setOriginAccount(Account originAccount) {
        this.originAccount = originAccount;
    }
    
    public Account getDestinationAccount() {
        return destinationAccount;
    }
    
    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void transfer() {
        if(amount <= originAccount.getBalance()) {
            originAccount.setBalance(originAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            System.out.println("\n✅ SINPE MOBILE TRANSFER SUCCESSFUL");
            System.out.println("Amount transferred: $" + amount);
            System.out.println("\n--- Origin Account ---");
            System.out.println("Bank: " + originAccount.getBank());
            System.out.println("Account: " + originAccount.getAccountNumber());
            System.out.println("New balance: $" + originAccount.getBalance());
            
            System.out.println("\n--- Destination Account ---");
            System.out.println("Bank: " + destinationAccount.getBank());
            System.out.println("Account: " + destinationAccount.getAccountNumber());
            System.out.println("New balance: $" + destinationAccount.getBalance());
        } else {
            System.out.println("Insufficient funds in origin account to make the transfer");
        }
    }
    
    public void checkBalance() {
        System.out.println("Origin account balance: $" + originAccount.getBalance());
        System.out.println("Destination account balance: $" + destinationAccount.getBalance());
    }
    
    @Override
    public String toString() {
        return "\n==== SINPE MOBILE ====" +
               "\nOrigin: " + originAccount.getAccountNumber() +
               "\n" + originAccount.getBank() +
               "\nDestination: " + destinationAccount.getAccountNumber() +
               "\n" + destinationAccount.getBank() +
               "\nAmount: $" + amount +
               "\n===================";
    }
}