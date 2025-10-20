
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CalcApp!");

        int options = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            options = scanner.nextInt();

            if (options >= 1 && options <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                switch (options) {
                    case 1:
                        result = Addition( num1, num2 );
                        break;
                    case 2:
                        result = Subtraction( num1, num2 );
                        break;
                    case 3:
                        result = Multiplication( num1, num2 );
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = Division( num1, num2 );
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                System.out.println("The result is: " + result);

            } else if ( options != 0 ) {
                System.out.println("Invalid option. Please try again.");
            }

        } while ( options != 0 );


        scanner.close();

    }


    private static double Addition(double num1, double num2) {
        return num1 + num2;
    }

    private static double Subtraction(double num1, double num2) {
        return num1 - num2;
    }

    private static double Multiplication(double num1, double num2) {
        return num1 * num2;
    }

    private static double Division(double num1, double num2) {
        return num1 / num2;
    }
}