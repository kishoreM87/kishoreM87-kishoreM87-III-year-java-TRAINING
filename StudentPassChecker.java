
import java.util.Scanner;

public class StudentPassChecker
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        String result = (marks >= 40 && attendance >= 75)
                        ? "Pass" : "Fail";

        System.out.println("Result: " + result);
        sc.close();
    }
}
