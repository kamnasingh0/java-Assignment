public class advance {
   // Here’s a simple Advanced Calculator program in Java that performs basic arithmetic operations, as well as advanced operations like square root, power, and trigonometric calculations. The program uses the Scanner class for user input and the Math library for advanced operations.

//Code
//Copy the code
import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Power (^)");
        System.out.println("6. Square Root (√)");
        System.out.println("7. Sine (sin)");
        System.out.println("8. Cosine (cos)");
        System.out.println("9. Tangent (tan)");

        System.out.print("Enter your choice (1-9): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1: // Addition
                System.out.print("Enter first number: ");
                double add1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double add2 = scanner.nextDouble();
                result = add1 + add2;
                System.out.println("Result: " + result);
                break;

            case 2: // Subtraction
                System.out.print("Enter first number: ");
                double sub1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double sub2 = scanner.nextDouble();
                result = sub1 - sub2;
                System.out.println("Result: " + result);
                break;

            case 3: // Multiplication
                System.out.print("Enter first number: ");
                double mul1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double mul2 = scanner.nextDouble();
                result = mul1 * mul2;
                System.out.println("Result: " + result);
                break;

            case 4: // Division
                System.out.print("Enter numerator: ");
                double num = scanner.nextDouble();
                System.out.print("Enter denominator: ");
                double den = scanner.nextDouble();
                if (den != 0) {
                    result = num / den;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5: // Power
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                result = Math.pow(base, exponent);
                System.out.println("Result: " + result);
                break;

            case 6: // Square Root
                System.out.print("Enter number: ");
                double sqrtNum = scanner.nextDouble();
                if (sqrtNum >= 0) {
                    result = Math.sqrt(sqrtNum);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Square root of a negative number is not defined.");
                }
                break;

            case 7: // Sine
                System.out.print("Enter angle in degrees: ");
                double sinAngle = scanner.nextDouble();
                result = Math.sin(Math.toRadians(sinAngle));
                System.out.println("Result: " + result);
                break;

            case 8: // Cosine
                System.out.print("Enter angle in degrees: ");
                double cosAngle = scanner.nextDouble();
                result = Math.cos(Math.toRadians(cosAngle));
                System.out.println("Result: " + result);
                break;

            case 9: // Tangent
                System.out.print("Enter angle in degrees: ");
                double tanAngle = scanner.nextDouble();
                result = Math.tan(Math.toRadians(tanAngle));
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }
}

Sample Output
Example 1: Addition
Copy the code
Welcome to the Advanced Calculator!
Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Power (^)
6. Square Root (√)
7. Sine (sin)
8. Cosine (cos)
9. Tangent (tan)
Enter your choice (1-9): 1
Enter first number: 10
Enter second number: 20
Result: 30.0

    
}
