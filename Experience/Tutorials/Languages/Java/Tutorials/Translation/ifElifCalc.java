package Java.Tutorials.Translation;

import java.util.Scanner;

public class ifElifCalc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println(intro());

        while (continueCalculation) {
            try {
                System.out.println("Enter an operation: ");

                String operation = scanner.nextLine();        
                double num1 = getNumber1(scanner);
                double num2 = getNumber2(scanner);

                double result = calculate(num1, num2, operation);
                System.out.println("Result: " + result);
                scanner.nextLine();
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number");
            }    
        }
    }

    public static String intro() {
        System.out.println("What operation would you like to perform?");
        System.out.println("Enter either 'add', 'subtract', 'multiply', or 'divide'");
        return "";
    }

    public static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }
    public static double getNumber1(Scanner scanner) {
        System.out.println("Enter the first number: ");
        return scanner.nextDouble();
    }

    public static double getNumber2(Scanner scanner) {
        System.out.println("Enter the second number: ");
        return scanner.nextDouble();
    }
}
