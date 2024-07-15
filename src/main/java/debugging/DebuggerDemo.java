public class DebuggerDemo {

    public static void main(String[] args) {
        DebuggerDemo demo = new DebuggerDemo();
        demo.start();
    }

    public void start() {
        int result = addNumbers(5, 10);
        String message = createMessage(result);
        printMessage(message);
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public String createMessage(int number) {
        String message = "The sum is: " + number;
        return message;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}