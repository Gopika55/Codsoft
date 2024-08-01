package com.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	private static final int MAX_ATTEMPTS = 5; // Maximum number of attempts
	private static int score = 0; // Player's score

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain;

		do {
			int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
			int attempts = 0;
			boolean guessedCorrectly = false;

			System.out.println("Guess the number between 1 and 100!");
			while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;

				if (userGuess < numberToGuess) {
					System.out.println("Too low! Try again.");
				} else if (userGuess > numberToGuess) {
					System.out.println("Too high! Try again.");
				} else {
					guessedCorrectly = true;
					System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
					score++; // Increment score for a correct guess
				}
			}

			if (!guessedCorrectly) {
				System.out.println("Sorry, you've used all attempts. The correct number was " + numberToGuess + ".");
			}

			System.out.println("Do you want to play again? (yes/no)");
			String response = scanner.next();
			playAgain = response.equalsIgnoreCase("yes");

		} while (playAgain);

		System.out.println("Your final score: " + score);
		scanner.close();
	}
}
