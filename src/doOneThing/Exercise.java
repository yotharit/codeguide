package doOneThing;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise for Do One Thing principle
 * Following the instruction in the comment below
 * @author tharitpongsaneh
 *
 */

public class Exercise {
	
	
	/**
	 * This method contain simple Guessing game but as the principle said one method should do
	 * one function
	 * 
	 * TO DO! : Breakdown the method in to small method that do specific function
	 * 
	 * Method we want we want : 
	 * getAnswer() - Get the String of the Number
	 * getRandom() - Random the secret number which between 1 and 10.
	 * isCorrect() - Check that either the answer is correct or not.
	 * run() - Run the logic of the program.
	 */
	public static void guessingGame(){
		Scanner scan = new Scanner( System.in );
		System.out.println( "Guessing Game" );
		System.out.println( "I'm thinking of a number between 1 and 10");
		boolean guessing = false;
		Random rand = new Random();
		int secret = rand.nextInt(10) + 1;
		while( guessing == false ) {
			System.out.print( "Your guess? " );
			int number = scan.nextInt();
			if(number!=secret){
				System.out.println("You're Wrong!!!");
			}
			else guessing = true;
		}
		System.out.println("You Won!!!");
	}
	
	/**
	 * Main class for the program you need to change method guessingGame() to run method()
	 * @param args
	 */
	public static void main(String[] args) {
		guessingGame();
	}
}
