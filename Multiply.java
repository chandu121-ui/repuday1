import java.util.Scanner;

class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long num1 = sc.nextLong();

        System.out.print("Enter second number: ");
        long num2 = sc.nextLong();

        long result = num1 * num2;

        System.out.println("Multiplication = " + result);

        sc.close();
    }
}
