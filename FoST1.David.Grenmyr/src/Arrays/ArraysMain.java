package Arrays;

public class ArraysMain {

	public ArraysMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		System.out.println("Showing my custom toString method: " +Arrays.toString(  new int [] { 1, 1, 2, 6, 24, 120, 720, 5040 }));
		System.out.println("Showing my custom sum method. Total value of Array { 1, 720, 5040 } is: " +Arrays.sum(  new int [] { 1, 720, 5040 }));
		System.out.println("Showing my custom addN method: Adding value 500 to each Element in injected array { 1, 1, 2, 6 }: " +Arrays.toString(Arrays.addN(  new int [] { 1, 1, 2, 6 },500)));
		System.out.println("Showing my custom reverse method. Reversing array{ 1, 2, 3 } :" +Arrays.toString(Arrays.reverse(  new int [] { 1, 2, 3})));
		System.out.println("Showing my custom replaceAll method. Replacing Elment with index [2] in { 1, 2, 3} array with int 100 :" +Arrays.toString(Arrays.replaceAll(  new int [] { 1, 2, 3},2,100)));
		System.out.println("Showing my custom sort method. Sorting int [] by size :" +Arrays.toString(Arrays.sort(  new int [] { 3212, 2222, 3,51})));
		System.out.println("Showing my custom hasSubsequence method. Return true because { 7,1,7 } is subsequnce of { 8,7,1,7,1111 }  : " +(Arrays.hasSubsequence(  new int [] { 8,7,1,7,1111},new int [] { 7,1,7})));
		System.out.println("Showing my custom absDif method. Calculating absolute difference between two arrays { 1,1,1,1} and {-5,1,5,0}  : " +Arrays.toString(Arrays.absDif(  new int [] { 1,1,1,1},new int [] {-5,1,5,0})));
		
		// Testing exception if length differ on injected arrays.
		try{
			Arrays.absDif(new int []{2,2,2},new int []{2,2});
		}catch(IndexOutOfBoundsException e){
			System.out.println("Both arrays injected need to be same length");
		}
	}

}
