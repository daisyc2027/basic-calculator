import java.util.Scanner;
public class BasicCalculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Taking input from user with scanner
        System.out.println("Please input two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        char op;
        double answer;
        do {
            //selecting operator for calculations
            System.out.println("Please choose the type of operation you want to perform: " +
                    "\n+, -, *, /, %");
            op = scanner.next().charAt(0);

            answer = 0;
            if (op == '+') {
                answer = num1 + num2;
            } else if (op == '-') {
                answer = num1 - num2;
            } else if (op == '*') {
                answer = num1 * num2;
            } else if (op == '/') {
                answer = num1 / num2;
            } else if (op == '%') {
                answer = num1 % num2;
            } else {
                System.out.println("Invalid operator, please try again.");
            }


        } while (op != '+' && op != '-' && op != '/' && op != '*' && op != '%');

        System.out.println("The answer is: " +
                "\n" + num1 + " " + op + " " + num2 + " = " + answer);
    }
}
