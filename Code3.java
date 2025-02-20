import java.util.*; // Importing required package

public class Code3 {
    public static void main(String[] args) {
        
        String input = "This is a test string. This string is for testing."; //input

        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

        // Split the string into words using spaces
        String[] words = input.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Loop through each word
        for (String word : words) {
            // Update word frequency in the map
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}