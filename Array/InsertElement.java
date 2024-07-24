import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Get the new element and the position to insert
        System.out.print("Enter the element to insert: ");
        int newElement = sc.nextInt();
        System.out.print("Enter the position to insert the element at (0 to " + size + "): ");
        int position = sc.nextInt();

        // Validate the position
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Please enter position between 0 and " + size);
        } else {
            // Create a new array with one more element
            int[] newArray = new int[size + 1];

            // Copy elements from the original array to the new array
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    newArray[i] = newElement;
                } else {
                    newArray[i] = array[j++];
                }
            }

            // Print the new array
            System.out.println("Array after insertion:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

        sc.close();
    }
}