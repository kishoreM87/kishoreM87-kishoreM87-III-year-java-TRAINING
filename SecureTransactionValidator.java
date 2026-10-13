import java.util.Scanner;

public class SecureTransactionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance (Rs): ");
        double balance = sc.nextDouble();
        System.out.print("Enter transfer amount (Rs): ");
        double amount = sc.nextDouble();
        System.out.print("Enter daily limit (Rs): ");
        double dailyLimit = sc.nextDouble();
        System.out.print("Is the account active? (yes/no): ");
        String reply = sc.next();
        boolean active = reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y");

        // Short-circuit AND: evaluation stops at the first failing condition
        boolean valid = amount > 0 && amount <= balance && amount <= dailyLimit && active;

        if (valid) {
            balance -= amount;   // deduct only when valid
        }

        System.out.println("Transaction status: " + (valid ? "Successful" : "Failed"));
        System.out.println("Remaining balance: Rs " + balance);
        sc.close();
    }
}
