// A simple program that checks if u can buy alcohol.

import java.util.Scanner;

public class ageChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in our shop!\nEnter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are able to buy alcohol.");
        }
        else if (age <= 0) {
            System.out.println("You have entered wrong value, please try again later.");
        }
        else{
            int years = 18 - age;
            System.out.println("Sorry, you are too young to buy alcohol.\nSee you in " + years + " years");
        }
    }
}
