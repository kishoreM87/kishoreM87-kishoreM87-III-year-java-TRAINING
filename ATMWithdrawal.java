
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount % 100 == 0
                && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Rejected");
            System.out.println("Balance: " + balance);
        }

        sc.close();
    }
}
