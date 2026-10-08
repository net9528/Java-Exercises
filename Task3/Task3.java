import java.util.Scanner;

public class Task3 {

    public static boolean isValidPassword(String password) {

        // Rule 1: At least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: Only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        // Rule 3: At least 2 digits
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");

        System.out.print("\nInput a password (You are agreeing to the above Terms and Conditions.): ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }

        input.close();
    }
}