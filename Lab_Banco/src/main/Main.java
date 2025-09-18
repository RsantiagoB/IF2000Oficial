package main;
import logic.*;

public class Main {

    public static void main(String[] args) {
        
        // Create clients
        Person client1 = new Person("801300495", "Juan Perez", 30, "88214402", "Street 123");
        Person client2 = new Person("102540360", "Maria Lopez", 25, "88765432", "Avenue 456");
        Person client3 = new Person("109876543", "Carlos Rodriguez", 35, "88998877", "Boulevard 789");
        
        // Create accounts from different banks
        SavingsAccount savingsAccount1 = new SavingsAccount(12, 1000.0, "CA123", client1, "Bank of Costa Rica", "01/01/2024", 12, 5.0);
        CheckingAccount checkingAccount1 = new CheckingAccount(6, 2000.0, "CC456", client2, "National Bank", "15/01/2024", 6, 3.0);
        SavingsAccount savingsAccount2 = new SavingsAccount(3, 3000.0, "CA789", client3, "BAC San Jose", "01/03/2024", 3, 4.0);
        
        System.out.println("=== BANKING OPERATIONS ===");
        
        // Show initial accounts
        System.out.println("\n--- Initial Accounts ---");
        System.out.println(savingsAccount1.toString());
        System.out.println("\n" + "=".repeat(50));
        System.out.println(checkingAccount1.toString());
        System.out.println("\n" + "=".repeat(50));
        System.out.println(savingsAccount2.toString());
        
        // Register account openings in ledger
        Ledger.registerMovement("ACCOUNT OPENING", savingsAccount1);
        Ledger.registerMovement("ACCOUNT OPENING", checkingAccount1);
        Ledger.registerMovement("ACCOUNT OPENING", savingsAccount2);
        
        // Make deposit
        System.out.println("\n--- Making $5000 deposit to account CA123 ---");
        savingsAccount1.deposit(5000.0);
        Ledger.registerMovement("DEPOSIT", savingsAccount1);
        System.out.println(savingsAccount1.toString());
        
        // Attempt withdrawal
        System.out.println("\n--- Attempting $2000 withdrawal from account CA123 ---");
        savingsAccount1.withdrawal(2000.0);
        Ledger.registerMovement("WITHDRAWAL", savingsAccount1);
        System.out.println(savingsAccount1.toString());
        
        // Calculate interest
        System.out.println("\n--- Interest calculation for account CA123 ---");
        System.out.println("Balance with interest: $" + savingsAccount1.calculateInterest());
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== SINPE MOBILE TRANSFERS ===");
        System.out.println("=".repeat(60));
        
        // TRANSFER 1: Between different banks (success)
        System.out.println("\n--- Transfer 1: BCR -> National Bank ---");
        SINPEMobile sinpe1 = new SINPEMobile(savingsAccount1, checkingAccount1, 1500.0);
        sinpe1.transfer();
        Ledger.registerMovement("SINPE TRANSFER - SEND", savingsAccount1);
        Ledger.registerMovement("SINPE TRANSFER - RECEIVE", checkingAccount1);
        
        // Check balances after transfer
        System.out.println("\n--- Balances after transfer 1 ---");
        sinpe1.checkBalance();
        
        // TRANSFER 2: Insufficient funds (should fail)
        System.out.println("\n\n--- Transfer 2: Attempting to transfer more than available balance ---");
        SINPEMobile sinpe2 = new SINPEMobile(checkingAccount1, savingsAccount2, 5000.0);
        sinpe2.transfer();
        // Not registered in ledger because it failed
        
        // TRANSFER 3: Successful smaller transfer
        System.out.println("\n\n--- Transfer 3: National Bank -> BAC San Jose ---");
        SINPEMobile sinpe3 = new SINPEMobile(checkingAccount1, savingsAccount2, 500.0);
        sinpe3.transfer();
        Ledger.registerMovement("SINPE TRANSFER - SEND", checkingAccount1);
        Ledger.registerMovement("SINPE TRANSFER - RECEIVE", savingsAccount2);
        
        // Check final balances
        System.out.println("\n\n--- Final balances of all accounts ---");
        System.out.println("\nBCR Account (CA123):");
        System.out.println("Balance: $" + savingsAccount1.getBalance());
        
        System.out.println("\nNational Bank Account (CC456):");
        System.out.println("Balance: $" + checkingAccount1.getBalance());
        
        System.out.println("\nBAC San Jose Account (CA789):");
        System.out.println("Balance: $" + savingsAccount2.getBalance());
        
        // Show final interest calculations
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== FINAL INTEREST CALCULATIONS ===");
        System.out.println("=".repeat(60));
        
        System.out.println("\nBCR Account (CA123) - Balance with interest:");
        System.out.println("$" + savingsAccount1.calculateInterest());
        
        System.out.println("\nNational Bank Account (CC456) - Balance with interest:");
        System.out.println("$" + checkingAccount1.calculateInterest());
        
        System.out.println("\nBAC San Jose Account (CA789) - Balance with interest:");
        System.out.println("$" + savingsAccount2.calculateInterest());
        
        // Show complete ledger at the end
        System.out.println("\n" + "=".repeat(70));
        Ledger.showLedger();
    }
}