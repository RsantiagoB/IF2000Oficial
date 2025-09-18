package logic;

public abstract class Account {
    
    private int termNumber;
    private double balance;
    private String accountNumber;
    private Person client;
    private String bank;
    
    
    public Account(int termNumber, double balance, String accountNumber, Person client, String bank) {
        this.termNumber = termNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.client = client;
        this.bank = bank;
    }
    
    public int getTermNumber() {
        return termNumber;
    }
    
    public void setTermNumber(int termNumber) {
        this.termNumber = termNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public Person getClient() {
        return client;
    }
    
    public void setClient(Person client) {
        this.client = client;
    }
    
    public String getBank() {
        return bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdrawal(double amount);
    public abstract double calculateInterest();
    
    @Override
    public String toString() {
        
        String result = "\n=== BANK ACCOUNT INFORMATION ==="
                + "\nBank: " + getBank()
                + "\nAccount Number: " + getAccountNumber()
                + "\nCurrent Balance: $" + getBalance()
                + "\nTerm (months): " + getTermNumber()
                + "\n" + getClient().toString();
        
        return result;
    }
}