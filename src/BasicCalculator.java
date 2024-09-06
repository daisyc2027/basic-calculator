import java.lang.*;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.println("Please enter the arithmetic operators: ");
        char op = scanner.next().charAt(0);
        double o = 0;

        switch (op) {
            case '+':
                o = num1+num2;
                break;

            case '*':
                o = num1*num2;
                break;

            case'-':
                o = num1-num2;
                break;

            case'/':
                o = num1/num2;
                break;

            default:
                System.out.println("Please enter a correct operator.");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + o);

    }
}