package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game");
		System.out.println("Make a guess:");
		Scanner input = new Scanner(System.in);
//		Random rand = new Random();
		
//		int winningNumber = rand.nextInt(11);
		int winningNumber=7;
		int guess = input.nextInt();
		int guessCount = 0;
		
		System.out.println("You guessed " + guess);

		while (guess != -1 && guessCount < 2) {
			if (guess == 0) {
				System.out.println("Try to guess a number. Please pick a number 1-10");
			} else if (guess != winningNumber) {
				
				System.out.println("Wrong Answer");
				if (guessCount== winningNumber) {
					System.out.println("You get one more guess");
				}
				if (guess < winningNumber) {
					System.out.println();
				}
					guessCount++;
			}
		if (guess == winningNumber) {
			System.out.println("You Win!");
			break;
		}
				
			
		}
		guess = input.nextInt();
		System.out.println("guess again");

	}

}
