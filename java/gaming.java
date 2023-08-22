import java.util.Scanner;
public class gaming {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100); // Generate random number between 0 and 100
        int guess = -1;
        int numGuesses = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the secret number between 0 and 100.");
        
        while (guess != secretNumber) {
          System.out.print("Enter your guess: ");
          guess = input.nextInt();
          numGuesses++;
          
          if (guess < secretNumber) {
            System.out.println("Your guess is too low.");
          } else if (guess > secretNumber) {
            System.out.println("Your guess is too high.");
          } else {
            System.out.println("Congratulations! You guessed the secret number in " + numGuesses + " guesses.");
          }
        }
      }

    
}
