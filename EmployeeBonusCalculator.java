import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary (Rs): ");
        double salary = sc.nextDouble();
        System.out.print("Enter performance score: ");
        int score = sc.nextInt();
        System.out.print("Enter completed projects: ");
        int projects = sc.nextInt();

        int bonusPercent =
              (score >= 90 && projects >= 3) ? 15
            : (score >= 75 || projects >= 5) ? 10
            : (score >= 60) ? 3
            : 0;

        double bonus = salary * bonusPercent / 100;
        double finalSalary = salary + bonus;

        System.out.println("Bonus percentage: " + bonusPercent + "%");
        System.out.println("Bonus amount: Rs " + bonus);
        System.out.println("Final salary: Rs " + finalSalary);
        sc.close();
    }
}
