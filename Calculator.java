import java.util.*;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String c = sc.next();  

        switch (c) {
            case "+":
                System.out.println("Result: " + add(a, b));
                break;
            case "-":
                System.out.println("Result: " + sub(a, b));
                break;
            case "*":
                System.out.println("Result: " + multiply(a, b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Second number cannot be 0");
                } else {
                    System.out.println("Result: " + div(a, b));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}
