import java.util.Scanner;

public class secondCalculator {

    public float addition(float a, float b) {
        return a+b;
    }
    public float subtraction(float a, float b) {
        return a-b;
    }
    public float multiplication(float a, float b) {
        return a*b;
    }
    public float division(float a, float b) {
        if (b == 0) {
            return 0;
        }
        else {
            return a/b;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        secondCalculator result = new secondCalculator();

        System.out.println("Enter first number: ");
        float firstNumber = input.nextFloat();
        System.out.println("Enter second number: ");
        float secondNumber = input.nextFloat();

        System.out.println("Addition: " + result.addition(firstNumber, secondNumber));
        System.out.println("Substraction: " + result.subtraction(firstNumber, secondNumber));
        System.out.println("Multiplication: " + result.multiplication(firstNumber, secondNumber));
        System.out.println("Division: " + result.division(firstNumber, secondNumber));

    }
}
