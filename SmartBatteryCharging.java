
import java.util.Scanner;

public class SmartBatteryCharging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        boolean chargingAllowed =
                battery < 90 && temperature >= 10
                && temperature <= 45;

        String status = chargingAllowed
                        ? "Charging Allowed" : "Charging Not Allowed";

        System.out.println(status);

        if (chargingAllowed) {
            battery += 5;

            // Prevent battery level from exceeding 100%
            battery = Math.min(battery, 100);

            System.out.println("Updated Battery: " + battery + "%");
        }

        sc.close();
    }
}

