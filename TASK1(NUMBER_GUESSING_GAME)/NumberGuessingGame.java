import java.util.Random;
import java.util.Scanner;

// or we can also use 'import java.util.*' for importing whole util library

public class NumberGuessingGame {
    public static void main(String[] args) {

        System.out.println("___________________NUMBER GUESSING GAME___________________");
        // initializing variables

        int LowestNum = 1;
        int HighestNum = 100;
        int MaxAttempts = 6;
        int TotalAttempts = 0;
        int NumOfRoundsWon = 0;
        boolean ContinuePlaying = true;
        // creating objects from classes
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // using while loop for the game
        while (ContinuePlaying) {
            int RandNum = rd.nextInt(HighestNum - LowestNum + 1) + LowestNum;
            int attempts = 0;
            boolean Victory = false;

            System.out.println(
                    "The random number generated is between " + LowestNum + " and " + HighestNum);
            System.out.println(
                    "NOTE: You have only " + MaxAttempts + " attempts for guessing the correct number.So play wisely.");

            // inner loop - this loop allows the user to either guess the correct number or
            // run out of all the attempts
            while (attempts < MaxAttempts && !Victory) {
                System.out.println("Enter the number that you think is the correct number : ");
                int guessTheNumber = sc.nextInt();
                attempts++;

                if (guessTheNumber == RandNum) {
                    Victory = true;
                    NumOfRoundsWon++;
                    System.out.println("Hurray! you got the number right.");
                } else if (guessTheNumber > RandNum) {
                    System.out.println("Guess is too high");
                } else {
                    System.out.println("Guess is too low.");
                }
                TotalAttempts++;
            }

            if (!Victory) {
                System.out.println("No more attempts left.You lost. The correct number was " + RandNum + ".");
            }
            System.out.print("Do you wish to test your intuition again ? (yes/no): ");
            ContinuePlaying = sc.next().equalsIgnoreCase("yes");

        }

        System.out.println("You made it this far.We hope you liked our game. Thank you for playing!");
        System.out.println("Number of rounds won: " + NumOfRoundsWon);
        System.out.println("Number of attempts attempts made: " + TotalAttempts);

        sc.close();
    }
}
