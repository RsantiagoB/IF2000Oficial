package logic;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ledger {
    private static int idCounter = 1;
    private static ArrayList<String> movements = new ArrayList<>();
    
    public static void registerMovement(String event, Account account) {
        // Get current date
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = dateFormat.format(currentDate);
        
        // Create movement record
        String record = "ID: " + idCounter +
                       " | Event: " + event +
                       " | Date: " + date +
                       " | Bank: " + account.getBank() +
                       " | Account: " + account.getAccountNumber() +
                       " | Client: " + account.getClient().getName() +
                       " | Balance: $" + account.getBalance();
        
        // Add to list and increase counter
        movements.add(record);
        idCounter++;
    }
    
    public static void showLedger() {
        System.out.println("\n=== MOVEMENTS LEDGER ===");
        System.out.println("Total movements: " + movements.size());
        System.out.println("=========================");
        
        if (movements.isEmpty()) {
            System.out.println("No movements registered.");
        } else {
            for (String movement : movements) {
                System.out.println(movement);
            }
        }
    }
    
    public static void clearLedger() {
        movements.clear();
        idCounter = 1;
        System.out.println("Ledger cleared successfully.");
    }
}