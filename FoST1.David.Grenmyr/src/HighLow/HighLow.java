package HighLow;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	private int secretNumber;
	private Scanner scanner = new Scanner(System.in);
	
	public HighLow() {
		Random rand = new Random();
		secretNumber = rand.nextInt(100 - 1 + 1) + 1;
		System.out.println(secretNumber);
		runGame();
	}
	private void runGame(){
		int guesses = 0;

		while(guesses <= 7){
			int guess = guess();
			guesses +=1;
			if(secretNumber < guess){
				System.out.print("you guessed " + guess+" it was to High.");
			}
			else if (secretNumber > guess){
				System.out.print("you guessed " + guess+" it was to Low.");
			}
			else if(secretNumber == guess){
				System.out.print("Yay you guessed correct then secret number was " + secretNumber+ " and took " +guesses + " attemts.");
				break;
			}
			
			if(guesses == 7){
				System.out.print("Game over 7 guesses has been used. Secret number was " + secretNumber);
				break;
			}			
		}	
		scanner.close();
		System.exit(0);
	}
	
	private int guess (){
		int guess = 0;
		do{
			System.out.print("Print a Guess between 1 and 100");
			guess = scanner.nextInt();	
			System.out.println(guess);
		}while(guess < 0 || guess > 100);
		
		return guess;
	}
	
	public static void main(String[] args) {
		new HighLow();	
	}

}
