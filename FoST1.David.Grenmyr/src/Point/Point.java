package Point;
import java.util.Arrays;

public class Point {
	
	private int [] point;
	private static final int X =0;
	private static final int Y =1;
	
	public Point() {
		point = new int [] {0,0};
	} 
	public Point(int x, int y){
		point = new int [] {x,y};
	}
	
	public static void main(String[] args){
		
	}
	
	@Override
	public String toString (){
		return "("+ point[X]+","+point[1]+")";		
	}
	
	public int [] getPosition(){
		return point;
	}
	
	@SuppressWarnings("unused")
	private String isequalTo(Point point2){
		int [] p2Pos = point2.getPosition();	
		if(Arrays.equals(point, p2Pos)){
			return "The two points are equal.";
		}
		return "The two points are not equal.";
	}
	@SuppressWarnings("unused")
	private void move (int distX, int distY){
		point[X] = point[X]+ distX;
		point[Y] = point[Y]+ distY;
	}
	@SuppressWarnings("unused")
	private void moveToXY(int newPosX, int newPosY){
		point[X] = newPosX;
		point[Y] = newPosY;
	}
	@SuppressWarnings("unused")
	private double distanceTo(Point point2){
		int [] p2Pos = point2.getPosition();
		double dist = Math.sqrt(Math.pow((point[X] - p2Pos[X]),2) + Math.pow((point[Y] -p2Pos[Y]),2));		
		return dist;
	}

	

}
