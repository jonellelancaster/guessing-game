package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game");
		System.out.println("Make a guess:");

		int winningNumber = rand.nextInt(11);

		int guess = input.nextInt();
		int guessCount = 0;

		while (guess != -1 && guessCount < 3) {
			System.out.println("You guessed " + guess);
				
			if(guess == 0||guess>=11) {
				System.out.println("Try to guess a number. Please pick a number 1-10");
			}else  if ( guess < winningNumber) {
				System.out.println(" Wrong Answer, Too Low!");
			} else if  (guess > winningNumber) {
				System.out.println("Wrong answer, Too High!");
			} else {
				System.out.println("You Win!");
			}

			guessCount++;
			if (guessCount < 3 && guess != winningNumber) {
				System.out.println("You get another guess");
			}
			
			if (guessCount < 3 || guess == 0||guess>=11) {

				guess = input.nextInt();
			}
		}
		
		System.out.println("Thanks for playing");

	}
	
		
	}

