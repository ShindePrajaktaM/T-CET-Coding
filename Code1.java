// Functional interface with single abstract method
interface Sayable {
    String say(String message);
}

public class Code1 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Sayable interface
        Sayable greet = (msg) -> "Hello, " + msg;

        // Calling the say method and printing the result
        System.out.println(greet.say("Prajakta"));
    }
}
