package Fraction;

public class FractionMain {

	public FractionMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Constructor setting random denominator and numerator numbers. Range -100 to 100.
		Fraction myFrac1 = new Fraction();
		// Or inject it on own values.
		Fraction myFrac2 = new Fraction(7,3);
		
		// Method to get denominator 
		System.out.println("Denominator is: " +myFrac1.getDenominator());		
		// Method to get numerator 	
		System.out.println("Numerator is: " +myFrac1.getNumerator());
		
		// Method to check if fraction is negative.
		if(myFrac1.isNegative()){
			System.out.println("Fraction is negative");
		}
		else{
			System.out.println("Fraction is positive");
		}
		
		// Method to print fraction numbers.
		System.out.println(myFrac2.toString());
		
		// Method to print out fraction value.
		System.out.println("Method to get value of fraction: " +myFrac2.getFraction());
		
		// Method to add int values to denominator and numerator and return double Fraction value.	
		System.out.println("Value of fraction after adding 2 is now: " +myFrac2.add(2));
		//System.out.println(myFrac1.toString());		
		// Method to subtract values to denominator and numerator and return double Fraction value.	
		System.out.println("Value of fraction after subtract 3 is now: "+myFrac2.subtract(3));
		// Method to multiply values to denominator and numerator and return double Fraction value.
		System.out.println("Before multiplying by 2: "+myFrac2.toString());
		myFrac2.multiply(2);
		System.out.println("After multiplying by 2: "+myFrac2.toString());
		// Method to divide values to denominator and numerator and return double Fraction value.
		System.out.println("Before dividing by 4: "+myFrac2.toString());
		myFrac2.divide(4);
		System.out.println("After dividing by 4: "+myFrac2.toString());
		
		// Error handle if trying to set either fraction numbers to 0
		System.out.println("Before tying to se denominator to 0: "+myFrac2.toString());
		myFrac2.subtract(1);
		System.out.println("After, failed insert, rollback to old value. "+myFrac2.toString());	
		// That is all public methods as requested by you.
		
		// Program got a couple private methods, setDenominator(), setNumerator(),
		// executeFraction() and castToInt(). All help Fraction to reduce DRY and privacy.
	}

}
