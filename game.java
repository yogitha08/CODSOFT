import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int random = (int) (Math.random() * (high - low + 1) + low);
        int attempts = 0;
        int score = 10;
        System.out.println("WELCOME TO NUMBER GAME!");

        while (attempts < 5) {
            System.out.println("Enter a number");
            int guess = scanner.nextInt();
            attempts++;
            if (guess < low || guess > high) {
                System.out.println("Enter a number between 1 and 100.");
            } else if (guess < random) {
                System.out.println("Too low! Try again.");
            } else if (guess > random) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("You guessed the number in " + attempts + " attempts.");
                score = 10 - (attempts - 1);
                System.out.println("Your score: " + score);
                break;
            }
        }
        if (attempts >= 5) {
            System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was: " + random);
        }
        scanner.close();
    }
}
