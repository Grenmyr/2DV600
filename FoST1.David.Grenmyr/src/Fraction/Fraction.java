package Fraction;

import java.util.Random;

public class Fraction {
	private int numerator, denominator;
	public Fraction() {
		Random random = new Random();	
		setNumerator(random.nextInt(200)-100);
		setDenominator(random.nextInt(200)-100);		
	}
	
	public Fraction (int numerator, int denominator){
		setNumerator(numerator);
		setDenominator(denominator);
	}
	
	private void setDenominator(int value){
		if(value == 0) {
			System.out.println("Can not comply action denominator value would be 0");
			throw new IndexOutOfBoundsException();	
		}
		denominator = value;
	}
	
	private void setNumerator(int value){
		if(value == 0) {
			System.out.println("Can not comply action numerator value would be 0");
			throw new IndexOutOfBoundsException();	
		}
		numerator = value;
	}
	
	public int getDenominator (){
		return denominator;
	}
	
	public int getNumerator (){
		return numerator;
	}
	
	public Boolean isNegative(){	
		if(denominator < 0 && numerator > 0){
			return true;
		}
		else if(numerator < 0 && denominator > 0){
			return true;
		}
		return false;
	}
	
	public double getFraction(){
		return (double)numerator/(double)denominator;
	}
	
	private double executeFraction(int newNumerator, int newDemoniator){
		int numerator = getNumerator();
		int denominator = getDenominator();
		try {
			setNumerator(newNumerator);
			setDenominator(newDemoniator);
		}catch(IndexOutOfBoundsException e){
			setNumerator(numerator);
			setDenominator(denominator);
		}
		return getFraction();
	}
	
	public double add (int number){
		double factionalNumber = executeFraction(getNumerator() + number, getDenominator() + number );	
		return factionalNumber;
	}
	
	public double subtract (int number){
		double factionalNumber = executeFraction(getNumerator() - number, getDenominator() - number );	
		return factionalNumber;
	}
	
	public double multiply (int factor){
		double denominator = (double)getDenominator()*factor;
		double numerator = (double)getNumerator()*factor;
		
		double factionalNumber = executeFraction(castToInt(numerator), castToInt(denominator));	
		return factionalNumber;
	}
	
	private int castToInt(double val){
		return (int)(val+0.5);
	}
	
	public double divide (int factor){
		double denominator = (double)getDenominator()/factor;
		double numerator = (double)getNumerator()/factor;

		double factionalNumber = executeFraction(castToInt(numerator), castToInt(denominator));	
		return factionalNumber;
	}
	
	public Boolean isEqualTo (Fraction fraction2){
		double frac2 = fraction2.getFraction();
		double frac1 = getFraction();
		return frac1 == frac2;
	}
	
	public String toString(){
		return "Fraction is: " +getNumerator()  +"/"+getDenominator();
	}
	
	
}
