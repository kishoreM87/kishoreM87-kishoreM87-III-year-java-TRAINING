import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();
        System.out.print("Enter family income (Rs): ");
        double income = sc.nextDouble();
        System.out.print("Enter extracurricular points: ");
        int extra = sc.nextInt();

        int scholarship =
              (marks >= 95 && income < 200000) ? 100
            : ((marks >= 85 && income < 400000) || (marks >= 90 && extra >= 8)) ? 50
            : (marks >= 75) ? 10
            : 0;

        System.out.println("Scholarship awarded: " + scholarship + "%");
        sc.close();
    }
}