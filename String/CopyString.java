import java.util.Scanner;
public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the original string
        System.out.print("Input string: ");
        String originalString = sc.nextLine();

        // Copy the original string to another string
        String copiedString = originalString;

        // Output the original and copied strings
        System.out.println("Original string: " + originalString);
        System.out.println("Copied string: " + copiedString);
    }
}