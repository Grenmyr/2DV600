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
			if(guess != 0){
				int viewGuess = guesses +1;						
				System.out.println("You used " +viewGuess  +" guesses.");
				guesses +=1;
				if(secretNumber < guess){
					System.out.print("you guessed " + guess+" it was to High. ");
				}
				else if (secretNumber > guess){
					System.out.print("you guessed " + guess+" it was to Low. ");
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
		}	
		scanner.close();
		System.exit(0);
	}
	
	private int guess (){
		int guess = 0;
		
		
			try{
				do{
					System.out.print("Print a Guess between 1 and 100");
					String line = scanner.nextLine();
					guess = Integer.parseInt(line);
					System.out.println(guess);	
				}
				while(guess < 0 || guess > 100);
				
			}catch(Exception e){			
				System.out.println("That is not an integer.");
				guess = 0;
				return guess;
			}
		return guess;
	}
	
	public static void main(String[] args) {
		new HighLow();	
	}

}
