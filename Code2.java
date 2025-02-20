
// Created a thread using Runnable interface
class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class Code2 {
    public static void main(String[] args) {
        // Create a thread and starting it
        Thread thread = new Thread(new NumberPrinter());
        thread.start();
    }
}
