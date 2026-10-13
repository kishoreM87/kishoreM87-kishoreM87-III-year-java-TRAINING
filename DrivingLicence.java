import java.util.Scanner;
public class DrivingLicence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(result);

        sc.close();
    }
}
