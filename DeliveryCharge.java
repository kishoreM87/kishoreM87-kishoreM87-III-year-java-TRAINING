import java.util.Scanner;

public class DeliveryCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order amount (Rs): ");
        double amount = sc.nextDouble();
        System.out.print("Premium member? (yes/no): ");
        String reply = sc.next();
        boolean premium = reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y");

        boolean freeDelivery = amount >= 1000 || premium;
        if (!freeDelivery) {
            amount += 50;   // delivery charge
        }
        System.out.println(freeDelivery ? "Free delivery applied." : "Delivery charge of Rs 50 added.");
        System.out.println("Final amount: Rs " + amount);
        sc.close();
    }
}

