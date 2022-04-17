import java.util.Scanner;

public class ageChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in our shop!\nEnter your age: ");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("Thank you for shopping!");
        }

        if (age < 18){
            int years = 18-age;
            System.out.println("Sorry, you are too young to buy alcohol.\nSee you in " + years + " years");
        }
    }
}
