import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void printMatrix(int n) {

        Random random = new Random();

        for (int row = 0; row < n; row++) {

            for (int column = 0; column < n; column++) {

                int number = random.nextInt(2);

                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = input.nextInt();

        printMatrix(n);

        input.close();
    }
}