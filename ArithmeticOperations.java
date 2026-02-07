public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);
    }
}