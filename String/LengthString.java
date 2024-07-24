import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Input string: ");
        String input = sc.nextLine();

        // Find the length of the string
        int length = input.length();

        // Output the length
        System.out.println("Length of string: " + length);
    }
}