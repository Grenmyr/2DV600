package Backwards;
import java.util.Scanner;

public class Backwards {
	public static void main(String[] args) {

	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Type a line of text:");
	   String line = scanner.nextLine();	   
	   System.out.print(new StringBuilder(line).reverse());
	   scanner.close();
	}
}


