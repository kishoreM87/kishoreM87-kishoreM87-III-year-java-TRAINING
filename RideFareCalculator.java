import java.util.Scanner;

public class RideFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter waiting time (minutes): ");
        double waiting = sc.nextDouble();
        System.out.print("Premium member? (yes/no): ");
        String reply = sc.next();
        boolean premium = reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y");

        if (distance <= 0 || waiting < 0) {
            System.out.println("Invalid input: distance must be positive and waiting time cannot be negative.");
        } else {
            double fare = 50;                                   // base fare
            fare += 12 * distance;                              // distance charge
            fare += (waiting > 5) ? 2 * (waiting - 5) : 0;      // waiting charge after 5 min
            boolean discount = premium && fare > 300;
            fare = discount ? fare * 0.90 : fare;               // 10% premium discount
            System.out.println(discount ? "Premium discount of 10% applied." : "No discount applied.");
            System.out.printf("Total fare: Rs %.2f%n", fare);
        }
        sc.close();
    }
}
