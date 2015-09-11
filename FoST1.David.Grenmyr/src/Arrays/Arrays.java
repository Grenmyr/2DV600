package Arrays;

public class Arrays {

	public Arrays() {
		//toString(  new int [] { 1, 1, 2, 6, 24, 120, 720, 5040 });
		//System.out.println(sum(new int [] { 1, 1, 2,}));
		//System.out.println(toString(addN(new int [] { 1, 1, 2, 6, 24, 120, 720},3)));
		//System.out.println(toString(reverse(new int [] {3,4,5,6,7})));
		//System.out.println(toString(reverse(new int [] {1,2,3,4,5})));
		//System.out.println(toString(replaceAll(new int [] {8,7,8,8},1,8)));
		//System.out.println(toString(sort(new int [] {8,7,1,7,1111})));
		//System.out.println(hasSubsequence(new int []{8,7,1,7,1111}, new int []{8,7,1,7,1111,1}));
		//System.out.println(toString(absDif(new int []{1,1,1,1}, new int []{-5,3,1,10})));
	}

	public static int[] absDif(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length){
			throw new java.lang.IndexOutOfBoundsException();
		}
		int [] absDif = new int [arr1.length];
		for (int i = 0; i < arr1.length; i++){
			absDif[i] = Math.abs(arr1[i]-arr2[i]);
		}
		return absDif;
	}
	
	public static  int[] addN (int[] arr, int n) {
		int [] tempArray = new int [arr.length];
		for(int i = 0; i < arr.length; i++){
			tempArray[i] = arr[i] + n;
		}
		return tempArray;
	}
	
	public static boolean hasSubsequence(int[] arr, int[] sub){
		if(arr.length < sub.length){
			throw new IllegalArgumentException();
		}
		int amountOfMatches = 0;
	    for(int i = 0; i < arr.length ; i++){	
	    	if( arr[i] == sub[0]){
	    		for(int x = 0; x < sub.length ; x++){
	    			if(sub[x] == arr[x+i]){
		    			amountOfMatches+=1;
		    			if(amountOfMatches == sub.length){
		    				return amountOfMatches == sub.length;
		    			}
	    			}else{
	    				amountOfMatches = 0;
	    				break;
	    			}
	    		}	    		
	    	}	    	
	    }	    
	    return false;
	}
	
	

	public static int [] replaceAll(int[] arr, int old, int nw){
		int [] tempArray = arr;
		tempArray[old] = nw;
		return tempArray;
	            
	}
	
	public static int [] reverse(int[] arr){
		int [] arrayToReverse = arr;
		for(int i = 0; i < arrayToReverse.length / 2; i++)
		{
		    int oldValue = arrayToReverse[i];
		    arrayToReverse[i] = arrayToReverse[arrayToReverse.length - i - 1];
		    arrayToReverse[arrayToReverse.length - i - 1] = oldValue;
		}
		
		return arrayToReverse;
	}
	public static  int[] sort(int[] arr){
		int [] tempArray = arr;
		java.util.Arrays.sort(tempArray);
		return tempArray;
	}
	
	public static int sum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i ++){
			sum += arr[i];
		}
		return sum;
	}
	
	public static String toString(int[] arr){	
		String [] tempArray = new String [arr.length];
		for(int i = 0; i < arr.length; i ++){
			tempArray[i] = i +" = " + arr[i];
		}
		return java.util.Arrays.toString(tempArray);
	}
}
