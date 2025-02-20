import java.util.*;
import java.util.stream.Collectors;

public class Code4 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Streams to filter even numbers and collect them in a new list
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0) // Filter condition for even numbers
                                           .collect(Collectors.toList());

        // Print the even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}

