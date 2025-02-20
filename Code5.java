import java.util.*;

public class Code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of crates
        System.out.print("Enter the number of crates N: ");
        int N = scanner.nextInt();

        // Create an array to store crate values
        int[] crates = new int[N];

        // Take input from the user
        System.out.println("Enter the crate values (use 0 for empty crates):");
        for (int i = 0; i < N; i++) {
            crates[i] = scanner.nextInt();
        }

        // Move empty crates (0's) to the end
        moveZerosToEnd(crates);

        // Display the result
        System.out.println("Crates after moving empty ones to the end: " + Arrays.toString(crates));

        scanner.close(); // Close the scanner
    }

    // Method to move all zeros to the end while keeping the order of non-zero elements
    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // Pointer for the position of non-zero elements

        // Move non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num; // Place non-zero crate and increment the index
            }
        }

        // Fill remaining positions with zeros (empty crates)
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
