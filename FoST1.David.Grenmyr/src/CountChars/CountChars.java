package CountChars;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountChars {
	int upperCaseCharacters;
	int lowerCaseCharacters;
	int whitespaceCharacters;
	int otherCharacters;
	int numberCharacters;
	
	public CountChars(String path) {
		System.out.println("Path is: "+ path);
		scan(path);
	}
	
	public static void main(String[] args) {
		String path = "C:\\tempskola\\test.txt";
		new CountChars(path);
	}
	
	private void scan(String path){
		
		try {
			File file = new File(path);
			Scanner fileScanner = new Scanner(file);	
			
			while(fileScanner.hasNextLine()){
				
				String nodes = fileScanner.nextLine();
				for(int i = 0; i < nodes.length(); i++) {
					
					if(Character.isUpperCase(nodes.charAt(i))){
						upperCaseCharacters +=1;
					}
					else if (Character.isLowerCase(nodes.charAt(i))){
						lowerCaseCharacters +=1;
					}
					else if (Character.isDigit(nodes.charAt(i))){
						numberCharacters +=1;
					}
					else if (Character.isWhitespace(nodes.charAt(i))){
						whitespaceCharacters +=1;
					}
					else{
						otherCharacters +=1;
					}
				}		
			}
			
			fileScanner.close();
			System.out.println("Uppercase Characters: " + upperCaseCharacters);
			System.out.println("Lowercase Characters: " + lowerCaseCharacters);
			System.out.println("Number Characters : " + numberCharacters);
			System.out.println("Whitespace Characters : " + whitespaceCharacters);
			System.out.println("other Characters : " + otherCharacters);
			
		} catch (IOException e1) {
			System.out.println("Error, make sure path is correct.");
		}
	}

	

}
