package CountDigits;


import java.util.Scanner;


public class CountDigits {

	public CountDigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			System.out.print("Print an Interger");
			int number = scanner.nextInt();
			if(number < 0){
				System.out.println("Number needs to be positive Integer.");
				main(args);
			}
			computeStatistics(number);
		}catch(Exception n){
				System.out.println("That was not an Integer.");		
				main(args);
		}		
		scanner.close();
		
	}
	
	public static void computeStatistics(int number){
		
		int zeroDigits = 0;
		int oddDigits = 0;
		int evenDigits= 0;
		
		while (number > 0) {
			if((number %10 % 2)== 0){	
				if(number %10 == 0){
					zeroDigits +=1;
				}
				else{
					evenDigits +=1;
				}
			}
			else{			
				if(number %10 == 0){
					zeroDigits +=1;
				}
				else{
					oddDigits +=1;
				}
			}
		    number = number / 10;
		}
		System.out.println("Zeros: " + zeroDigits);
		System.out.println("Odd: " + oddDigits);
		System.out.println("Even: " + evenDigits);
		System.out.println("Sum: ?");
	}
}
