
import java.util.Scanner;

public class LoginAttemptController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum attempts: ");
        int maxAttempts = sc.nextInt();

        System.out.print("Enter failed attempts: ");
        int failedAttempts = sc.nextInt();

        if (failedAttempts < maxAttempts) {
            System.out.println("Login attempt allowed");

            System.out.print("Did login fail? (true/false): ");
            boolean loginFailed = sc.nextBoolean();

            if (loginFailed) {
                failedAttempts++;
            }

            if (failedAttempts < maxAttempts) {
                System.out.println("Next attempt allowed");
            } else {
                System.out.println("Account is locked");
            }
        } else {
            System.out.println("Account is locked");
        }

        System.out.println("Failed attempts: " + failedAttempts);
        sc.close();
    }
}
