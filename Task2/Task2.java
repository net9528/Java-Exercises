import java.util.Scanner;

public class Task2 {

    // Function 1: Show menu
    public static void showMenu() {
        System.out.println("\nMENU");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Modulus");
        System.out.println("6: Exit");
    }

    // Function 2: Add
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function 3: Subtract
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function 4: Multiply
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function 5: Divide
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Function 6: Modulus
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char again = 'Y';

        while (again == 'Y' || again == 'y') {

            showMenu();

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter a number1: ");
            double num1 = input.nextDouble();

            System.out.print("Enter a number2: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    result = divide(num1, num2);
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Cannot use modulus with zero!");
                        continue;
                    }
                    result = modulus(num1, num2);
                    break;
            }

            System.out.println("The result is " + result);

            System.out.print("Do you want to perform another operation (Y or N)? ");
            again = input.next().charAt(0);
        }

        input.close();
    }
}