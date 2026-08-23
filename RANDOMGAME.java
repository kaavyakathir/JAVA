import java.util.Random;
import java.util.Scanner;

public class RANDOMGAME{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretnumber = random.nextInt(100);
        
        System.out.println("How many amount of tries do you want to guess the number?");
        int tries = scanner.nextInt();
        int guess;
        System.out.println("Guess a number between 0 and 100");
        
        boolean won = false;
        
        for (int i = 0; i < tries; i++) {
            guess = scanner.nextInt();
            if (guess == secretnumber) {
                System.out.println("Congratulations! You guessed the number!");
                won = true;
                break;
            } else if (guess < secretnumber) {
                System.out.println("The number is higher than your guess.");
            } else {
                System.out.println("The number is lower than your guess.");
            }
        }
        
        if (!won) {
            System.out.println("Sorry, you've used all your tries. The secret number was: " + secretnumber);
        }
    }
}