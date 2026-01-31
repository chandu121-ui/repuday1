import java.util.Scanner;
Imports the Scanner class so we can take input from the user.

class MultiplyTwoNumbers
Defines the class. Every Java program must have a class.

public static void main(String[] args)
This is the main method. The program starts running from here.

Scanner sc = new Scanner(System.in);
Creates a Scanner object to read input from the keyboard.

int num1 = sc.nextInt();
Reads the first number entered by the user and stores it in num1.

int num2 = sc.nextInt();
Reads the second number entered by the user and stores it in num2.

int result = num1 * num2;
Multiplies the two numbers and stores the result.

System.out.println("Multiplication = " + result);
Prints the multiplication result on the screen.

sc.close();
Closes the Scanner to free resources.
