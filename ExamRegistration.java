import java.util.Scanner;

public class ExamRegistration {
    static boolean yes(String s) {
        return s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
        System.out.print("Approved medical certificate? (yes/no): ");
        boolean medical = yes(sc.next());
        System.out.print("Examination fee paid? (yes/no): ");
        boolean feePaid = yes(sc.next());
        System.out.print("All assignments submitted? (yes/no): ");
        boolean assignments = yes(sc.next());

        boolean attendanceOk = attendance >= 75 || (attendance >= 65 && medical);
        boolean eligible = attendanceOk && feePaid && assignments;

        System.out.println(eligible ? "Registration Successful" : "Registration Rejected");
        sc.close();
    }
}
