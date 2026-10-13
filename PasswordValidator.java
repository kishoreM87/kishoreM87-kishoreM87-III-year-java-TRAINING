
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean accountActive = true;

        String result = (password.length() >= 8 && accountActive)
                        ? "Valid Password" : "Invalid Password";

        System.out.println(result);
        sc.close();
    }
}


