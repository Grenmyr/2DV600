package LargestK;

import java.util.Scanner;

public class LargestK {
	Scanner scanner = new Scanner(System.in);
	int increment = 0;
	int numberK = 0;
	int totalSum = 0;

	public LargestK() {
		
		new LargestK(setNumberN());
	}
	
	public LargestK(int number){
		while(number  >= totalSum + numberK + 2){		
			numberK += 2;
			totalSum += numberK;	
		}
		System.out.println(numberK);
	}
	
	
	public int setNumberN(){
		int number = 0;
		do{		
			System.out.print("Provide a positive integer to find out LargestK");				
			try{
				String line = scanner.nextLine();
				number = Integer.parseInt(line);
			} catch(NumberFormatException n){
				System.out.println("That was not an Integer.");
				new LargestK();
			}		
		}
		while(number < 0);
		scanner.close();
		return number;
		
	}
	

	public static void main(String[] args) {
		new LargestK();
	}
}
