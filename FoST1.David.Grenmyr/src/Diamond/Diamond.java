package Diamond;

import java.util.Scanner;

public class Diamond {
	Scanner scanner = new Scanner(System.in);

	
	public Diamond() {
		new Diamond(setShape());
	}
	public Diamond(int arbitraryPositiveInteger){
		 for (int i = 1; i <= arbitraryPositiveInteger; i += 2) {
		      for (int j = 0; j <= arbitraryPositiveInteger - i / 2; j++){
		    	  System.out.print(" ");
		      }
		      for (int j = 0; j < i; j++){
		    	  System.out.print("*");	      		
		      }		   
		      System.out.print("\n");
		 }   
		 
		 for (int i = arbitraryPositiveInteger -2 ; i >= 0 ; i -= 2) {
			 	for (int j = 0; j <= arbitraryPositiveInteger - i / 2; j++){
			 		System.out.print(" "); 
	 			}
		      	for (int j = 0; j < i; j++){
		    	  System.out.print("*");
		      	}		
		      	System.out.print("\n");
	    }
	}

	public static void main(String[] args) {
		new Diamond();		
	}
	
	public int setShape(){
		System.out.println("Provide an arbitrary positive odd integer");
		int number = 0;
		try{
			String line = scanner.nextLine();
			number = Integer.parseInt(line);
			if(number % 2 == 1 && number > 0){
				return number;
			}
			System.out.println("That was not an odd positive arbitrary integer");
			new Diamond();
		} catch(NumberFormatException n){
			System.out.println("That was not an Integer.");
			new Diamond();
		}	
		return number;
	}
}
