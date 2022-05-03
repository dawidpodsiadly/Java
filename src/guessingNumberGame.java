import java.util.Scanner;

public class guessingNumberGame {

    public static void
    guessNumber() {

        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int trials = 5;
        int i;
        int guess;

        System.out.println("A number is chosen between 1 to 100. Guess the number in 5 trials!");

        for (i = 0; i < trials; i++) {

            System.out.println("Guess the number!");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Gratz, You have guessed the number in " + (i + 1) + "tries");
                break;
            }

            else if (number > guess && i != trials - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != trials - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == trials) {
            System.out.println("You are out of tries. Try again later!");
            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[]) {
        guessNumber();
    }
}