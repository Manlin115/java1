import java.util.Scanner;

public class ConcatenatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the original string
        System.out.print("1st Input string: ");
        String s1 = sc.nextLine();

        // Copy the original string to another string
        System.out.print("2nd Input string: ");
        String s2 = sc.nextLine();
        String concatenatedString = s1+s2;

        // Output the original and copied strings
        
        System.out.println("concatenatedString: " + concatenatedString);
    }
}