import java.util.Scanner;

public class EqualTwoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Input string1: ");
        String string1 = scanner.nextLine();

        // Input the second string
        System.out.print("Input string2: ");
        String string2 = scanner.nextLine();

        // Compare the two strings lexicographically
        int result = string1.compareTo(string2);

        // Output the result
        if (result == 0) {
            System.out.println("Both strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("String1 is lexicographically less than String2.");
        } else {
            System.out.println("String1 is lexicographically greater than String2.");
        }
    }
}