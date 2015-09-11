package Histogram;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class Histogram {
	
	private String _path;
	private int[][] rangeArr;
	private LinkedList<Integer> allInts;
	
	public Histogram(String path) {
			_path = path;
			allInts = findInts(_path);			
			rangeArr = createRangeArr();	
			
			printIntsInInterval();
			String [] viewArray = mashData(allInts,rangeArr);	
			print(viewArray);
			
			printPartial(rangeArr,allInts,1);
	}
	
	public static void main(String[] args) {
		try{ 
			new Histogram(args[0]);
			}
		catch(Exception e){		
			System.out.println("Please add string as argument");
		}
	}
	
	private int getIntervalFrequency (int element){
		int frequency = 0;
		for(int n = 0; n < allInts.size(); n++) {
			int value = allInts.get(n);								
				if(value >= rangeArr[element][0] && value <= rangeArr[element][1] ){
					frequency +=1;				
				}						
		}
		return frequency;
	}
	
	public void printPartial( int[][] rangeArr,  LinkedList<Integer> allInts,int element){
		int frequenzy = getIntervalFrequency(element);
		System.out.println("Integers in range: "+Arrays.toString(rangeArr[element])+" "+frequenzy);
	}	
	
	public void print (String [] viewArray){
		System.out.println("Total amount of Integers in interval: ");
		for(int n = 0; n < viewArray.length; n++) {				
			System.out.println(viewArray[n]);
		}
	}
	
	public void printIntsInInterval(){
		int amount = 0;
		for (int i=0; i < allInts.size(); i++){
			if(allInts.get(i) > 0 && allInts.get(i) < 200){
				amount +=1;
			}
		}
		System.out.println("Amount of Ints in interval is: "+amount);
	}
	
	public String[] mashData (LinkedList<Integer> allInts, int[][] rangeArr){
		String [] viewArr = new String [rangeArr.length];
		
		for(int i = 0; i < rangeArr.length; i++) {
			viewArr[i] = +rangeArr[i][0]+"-"+rangeArr[i][1]+"\t";
			viewArr[i] += getIntervalFrequency(i);
		}
		return viewArr;
	}

	

	private int[][] createRangeArr() {
		int x= 10;
		int q=0;
		int [][]  ret = new int[11][];
		
		for (int i = 1; i <= 100; i+=10){
					ret[q] = new int []{i,x};					
			x += 10;
			q +=1;
		}
		ret[10] = new int []{101,200};		
		return ret;
	}

	private LinkedList<Integer> findInts (String path){
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		try {
			
			File file = new File(path);
			Scanner fileScanner = new Scanner(file);	
			
			while (fileScanner.hasNext()) {
			    if (fileScanner.hasNextInt()) {
			    		int nextInt = fileScanner.nextInt();
			    		linkedList.add(nextInt);
			    } else {
			    	fileScanner.next();
			    }
			}
			fileScanner.close();
		} catch (IOException e1) {
			System.out.println("Error, make sure path is correct.");
		}
			return linkedList;
	}
}
