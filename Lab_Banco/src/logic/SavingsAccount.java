package logic;

public class SavingsAccount extends Account {
    private String initialDate;
    private double months;
    private Double interest;
    
    public SavingsAccount(int termNumber, double balance, String accountNumber, Person person, String bank, 
                         String initialDate, int months, Double interest) {
        super(termNumber, balance, accountNumber, person, bank);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }
    
    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public double getMonths() {
        return months;
    }

    public void setMonths(double months) {
        this.months = months;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }
    
    public void withdrawal(double amount) {
        if(amount <= this.getBalance()) {
            super.setBalance(this.getBalance() - amount);    
        } else {
            System.out.println("Insufficient funds to make the withdrawal");
        }
    }
    
    public double calculateInterest() {
        double interestEarned;
        interestEarned = getMonths() * super.getBalance() * getInterest() / 100;
        return super.getBalance() + interestEarned;
    }

    @Override
    public String toString() {
        
        String result = "\nAccount Type: Savings Account" + super.toString() + 
                "\n------------------------" +
                "\nInitial Date: " + this.getInitialDate() + 
                "\nMonths of saving: " + this.getMonths() + 
                "\nInterest: " + this.getInterest() + "%" +
                "\nGained interest: " + (this.calculateInterest() - super.getBalance()) +
                "\nBalance after interest: " + this.calculateInterest();
        
        return result;
    }
}