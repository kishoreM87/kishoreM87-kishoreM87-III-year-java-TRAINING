import java.util.Scanner;

public class InventoryReorderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current stock: ");
        int stock = sc.nextInt();
        System.out.print("Enter minimum stock level: ");
        int minLevel = sc.nextInt();
        System.out.print("Enter incoming stock: ");
        int incoming = sc.nextInt();

        stock += incoming;   // compound assignment
        System.out.println("Updated stock: " + stock);
        System.out.println(stock < minLevel ? "Reorder Required" : "Stock Sufficient");
        sc.close();
    }
}