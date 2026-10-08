import java.util.Scanner;

public class Task1 {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = input.nextLine();

        int numberOfWords = countWords(str);

        System.out.println("Number of words in the string: " + numberOfWords);

        input.close();
    }
}