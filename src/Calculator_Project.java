import java.util.Scanner;

public class Calculator_Project{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char op;

        while(true) {
            System.out.println("Enter first number:");
            num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            num2 = sc.nextDouble();

            System.out.println("Choose operation (+, -, *, /):");
            op = sc.next().charAt(0);

            result = 0;

            switch(op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (y/n)");
            char again = sc.next().charAt(0);
            if(again == 'n' || again == 'N') {
                System.out.println("Exiting Calculator. Thank you!");
                break;
            }
        }
    }
}
