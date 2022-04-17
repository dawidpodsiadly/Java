import java.net.SocketOption;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.print("(1) Addition\n");
        System.out.print("(2) Subtraction\n");
        System.out.print("(3) Multiplication\n");
        System.out.print("(4) Division\n");
        System.out.print("(5) Exit\n\n");

        do {
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();
            System.out.println("Enter a: ");
            float a = input.nextFloat();
            System.out.println("Enter b: ");
            float b = input.nextFloat();

            switch (choice) {
                case 1:
                    System.out.println("You answer: " + (a + b) + "\n");
                    continue;

                case 2:
                    System.out.println("You answer: " + (a - b) + "\n");
                    break;

                case 3:
                    System.out.println("You answer: " + (a * b) + "\n");
                    break;

                case 4:
                    if(b == 0) {
                        System.out.println("You can't divide by 0!\n");
                        break;
                    }

                    else {
                        System.out.println("You answer: " + (a / b) + "\n");
                        break;
                    }

                case 5:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("invalid operator!");
            }
        }while (choice != 5);
    }
}