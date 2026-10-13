
import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean premium = sc.nextBoolean();

        String result = (amount >= 2000 || premium)
                        ? "Discount Available" : "No Discount";

        System.out.println(result);
        sc.close();
    }
}
